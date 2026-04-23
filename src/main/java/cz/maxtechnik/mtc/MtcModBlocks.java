package cz.maxtechnik.mtc;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
public class MtcModBlocks{
	public static final DeferredRegister<Block> REGISTRY=DeferredRegister.create(ForgeRegistries.BLOCKS,MtcMod.MODID);
	public static final RegistryObject<Block>NECO=REGISTRY.register("neco",()->new Block(BlockBehaviour.Properties.of()));
}
