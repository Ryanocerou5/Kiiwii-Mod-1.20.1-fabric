package github.ryanocerou5.kiiwii.init;

import github.ryanocerou5.kiiwii.KiiwiiMod;
import github.ryanocerou5.kiiwii.blockentity.LockerBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockEntityInit {
    public static final BlockEntityType<LockerBlockEntity> LOCKER_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(KiiwiiMod.MOD_ID, "locker_be"),
                    FabricBlockEntityTypeBuilder.create(LockerBlockEntity::new,
                            BlockInit.LOCKER).build());

    public static void registerBlockEntities()
    {
        KiiwiiMod.LOGGER.info("Registering Block Entities for " + KiiwiiMod.MOD_ID);
    }
}
