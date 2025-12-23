package github.ryanocerou5.kiiwii.init;

import github.ryanocerou5.kiiwii.KiiwiiMod;
import github.ryanocerou5.kiiwii.item.SoundboardItem;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.SpriteBillboardParticle;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;

public class PacketInit {

    public static void registerServerReceivers() {
        ServerPlayNetworking.registerGlobalReceiver(new Identifier(KiiwiiMod.MOD_ID, "soundboard_sound"),
                (minecraftServer, serverPlayerEntity, serverPlayNetworkHandler, packetByteBuf, packetSender) -> {
                    int soundId = packetByteBuf.readInt();

                    minecraftServer.execute(() -> {

                        ItemStack held = serverPlayerEntity.getMainHandStack();
                        if (held.getItem() instanceof SoundboardItem) {
                            serverPlayerEntity.getItemCooldownManager().set(held.getItem(), 40);
                        }

                        SoundEvent sound = switch (soundId) {
                            case 0 -> SoundEvents.AMBIENT_CAVE.value();
                            case 1 -> SoundEventInit.CORRECT_NEW;
                            case 2 -> SoundEventInit.GREETINGS_NEW;
                            case 3 -> SoundEventInit.YIPPEE_NEW;
                            case 4 -> SoundEventInit.WRONG_NEW;
                            case 5 -> SoundEventInit.CRICKETS;
                            case 6 -> SoundEventInit.RIZZ;
                            case 7 -> SoundEventInit.RECORD_SCRATCH;
                            case 8 -> SoundEventInit.UNDERTAKER;
                            case 9 -> SoundEventInit.COUNTDOWN;
                            case 10 -> SoundEventInit.WINDOWS_SHUTDOWN;
                            case 11 -> SoundEventInit.ALERT_NEW;
                            case 12 -> SoundEventInit.VINE_BOOM;
                            case 13 -> SoundEventInit.GHETTO_SMOSH;
                            case 14 -> SoundEventInit.BOOWOMP_NEW;
                            case 15 -> SoundEventInit.TA_DA_NEW;
                            case 16 -> SoundEventInit.BONE_CRACK_NEW;
                            case 17 -> SoundEventInit.VIOLIN_SCREECH_NEW;

                            default -> null;
                        };

                        if (sound != null)
                        {
                            serverPlayerEntity.getServerWorld().playSound(null, serverPlayerEntity.getBlockPos(), sound, SoundCategory.PLAYERS, 1f, 1f);
                            for (int i = 0; i < 3; i++) {
                                double x = serverPlayerEntity.getX();
                                double y = serverPlayerEntity.getY() + 1;
                                double z = serverPlayerEntity.getZ();

                                double vx = (serverPlayerEntity.getServerWorld().random.nextDouble() - 0.5) * 0.01;
                                double vy = 0.1 + serverPlayerEntity.getServerWorld().random.nextDouble() * 0.1;
                                double vz = (serverPlayerEntity.getServerWorld().random.nextDouble() - 0.5) * 0.01;

                                serverPlayerEntity.getServerWorld().spawnParticles(ParticleInit.SOUNDBOARD_BUBBLE, x, y, z, 1, vx, vy, vz, 0.0);
                            }
                        }
                    });
                });

        ServerPlayNetworking.registerGlobalReceiver(new Identifier(KiiwiiMod.MOD_ID, "confetti_cannon"),
                (server, player, handler, buf, sender) -> {
                    int count = buf.readInt();
                    double lx = buf.readDouble();
                    double ly = buf.readDouble();
                    double lz = buf.readDouble();
                    Vec3d look = new Vec3d(lx, ly, lz);

                    server.execute(() -> {
                        ServerWorld world = player.getServerWorld();
                        Vec3d origin = player.getPos().add(0, 1, 0);

                        for (int i=0; i < count; i++) {
                            Vec3d spread = look
                                    .add(world.random.nextDouble() - 0.5,
                                        world.random.nextDouble() - 0.5,
                                        world.random.nextDouble() - 0.5)
                                    .normalize();

                            double speed = 1.0 + world.random.nextDouble() * 0.5;
                            double vx = spread.x * speed;
                            double vy = spread.y * speed + 0.3;
                            double vz = spread.z * speed;

                            world.spawnParticles(ParticleInit.CONFETTI, origin.x, origin.y, origin.z, 1, vx, vy, vz, 0.0);
                        }
                    });
                });
    }
}
