package cz.maxtechnik.mtc;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.world.level.block.Blocks.*;
public class MtcModBlocks{
	public static final DeferredRegister<Block> REGISTRY=DeferredRegister.create(ForgeRegistries.BLOCKS,MtcMod.MODID);
	static BlockBehaviour.Properties c_cobblestone_props=BlockBehaviour.Properties.copy(COBBLESTONE);
	public static final RegistryObject<Block>C1_COBBLESTONE=REGISTRY.register("c1_cobblestone",()->new Block(c_cobblestone_props));
	public static final RegistryObject<Block>C2_COBBLESTONE=REGISTRY.register("c2_cobblestone",()->new Block(c_cobblestone_props));
	public static final RegistryObject<Block>C3_COBBLESTONE=REGISTRY.register("c3_cobblestone",()->new Block(c_cobblestone_props));
	public static final RegistryObject<Block>C4_COBBLESTONE=REGISTRY.register("c4_cobblestone",()->new Block(c_cobblestone_props));
	public static final RegistryObject<Block>C5_COBBLESTONE=REGISTRY.register("c5_cobblestone",()->new Block(c_cobblestone_props));
	public static final RegistryObject<Block>C6_COBBLESTONE=REGISTRY.register("c6_cobblestone",()->new Block(c_cobblestone_props));
	public static final RegistryObject<Block>C7_COBBLESTONE=REGISTRY.register("c7_cobblestone",()->new Block(c_cobblestone_props));
	public static final RegistryObject<Block>C8_COBBLESTONE=REGISTRY.register("c8_cobblestone",()->new Block(c_cobblestone_props));
	public static final RegistryObject<Block>C9_COBBLESTONE=REGISTRY.register("c9_cobblestone",()->new Block(c_cobblestone_props));

	static BlockBehaviour.Properties c_dirt_props=BlockBehaviour.Properties.copy(DIRT);
	public static final RegistryObject<Block>C1_DIRT=REGISTRY.register("c1_dirt",()->new Block(c_dirt_props));
	public static final RegistryObject<Block>C2_DIRT=REGISTRY.register("c2_dirt",()->new Block(c_dirt_props));
	public static final RegistryObject<Block>C3_DIRT=REGISTRY.register("c3_dirt",()->new Block(c_dirt_props));
	public static final RegistryObject<Block>C4_DIRT=REGISTRY.register("c4_dirt",()->new Block(c_dirt_props));
	public static final RegistryObject<Block>C5_DIRT=REGISTRY.register("c5_dirt",()->new Block(c_dirt_props));
	public static final RegistryObject<Block>C6_DIRT=REGISTRY.register("c6_dirt",()->new Block(c_dirt_props));
	public static final RegistryObject<Block>C7_DIRT=REGISTRY.register("c7_dirt",()->new Block(c_dirt_props));
	public static final RegistryObject<Block>C8_DIRT=REGISTRY.register("c8_dirt",()->new Block(c_dirt_props));
	public static final RegistryObject<Block>C9_DIRT=REGISTRY.register("c9_dirt",()->new Block(c_dirt_props));


	static BlockBehaviour.Properties c_gravel_props=BlockBehaviour.Properties.copy(GRAVEL);
	public static final RegistryObject<Block>C1_GRAVEL=REGISTRY.register("c1_gravel",()->new Block(c_gravel_props));
	public static final RegistryObject<Block>C2_GRAVEL=REGISTRY.register("c2_gravel",()->new Block(c_gravel_props));
	public static final RegistryObject<Block>C3_GRAVEL=REGISTRY.register("c3_gravel",()->new Block(c_gravel_props));
	public static final RegistryObject<Block>C4_GRAVEL=REGISTRY.register("c4_gravel",()->new Block(c_gravel_props));
	public static final RegistryObject<Block>C5_GRAVEL=REGISTRY.register("c5_gravel",()->new Block(c_gravel_props));
	public static final RegistryObject<Block>C6_GRAVEL=REGISTRY.register("c6_gravel",()->new Block(c_gravel_props));
	public static final RegistryObject<Block>C7_GRAVEL=REGISTRY.register("c7_gravel",()->new Block(c_gravel_props));
	public static final RegistryObject<Block>C8_GRAVEL=REGISTRY.register("c8_gravel",()->new Block(c_gravel_props));
	public static final RegistryObject<Block>C9_GRAVEL=REGISTRY.register("c9_gravel",()->new Block(c_gravel_props));


	static BlockBehaviour.Properties c_deepslate_props=BlockBehaviour.Properties.copy(COBBLED_DEEPSLATE);
	public static final RegistryObject<Block>C1_DEEPSLATE=REGISTRY.register("c1_deepslate",()->new RotatedPillarBlock(c_deepslate_props));
	public static final RegistryObject<Block>C2_DEEPSLATE=REGISTRY.register("c2_deepslate",()->new RotatedPillarBlock(c_deepslate_props));
	public static final RegistryObject<Block>C3_DEEPSLATE=REGISTRY.register("c3_deepslate",()->new RotatedPillarBlock(c_deepslate_props));
	public static final RegistryObject<Block>C4_DEEPSLATE=REGISTRY.register("c4_deepslate",()->new RotatedPillarBlock(c_deepslate_props));
	public static final RegistryObject<Block>C5_DEEPSLATE=REGISTRY.register("c5_deepslate",()->new RotatedPillarBlock(c_deepslate_props));
	public static final RegistryObject<Block>C6_DEEPSLATE=REGISTRY.register("c6_deepslate",()->new RotatedPillarBlock(c_deepslate_props));
	public static final RegistryObject<Block>C7_DEEPSLATE=REGISTRY.register("c7_deepslate",()->new RotatedPillarBlock(c_deepslate_props));
	public static final RegistryObject<Block>C8_DEEPSLATE=REGISTRY.register("c8_deepslate",()->new RotatedPillarBlock(c_deepslate_props));
	public static final RegistryObject<Block>C9_DEEPSLATE=REGISTRY.register("c9_deepslate",()->new RotatedPillarBlock(c_deepslate_props));


	static BlockBehaviour.Properties c_cobbled_deepslate_props=BlockBehaviour.Properties.copy(DEEPSLATE);
	public static final RegistryObject<Block>C1_COBBLED_DEEPSLATE=REGISTRY.register("c1_cobbled_deepslate",()->new Block(c_cobbled_deepslate_props));
	public static final RegistryObject<Block>C2_COBBLED_DEEPSLATE=REGISTRY.register("c2_cobbled_deepslate",()->new Block(c_cobbled_deepslate_props));
	public static final RegistryObject<Block>C3_COBBLED_DEEPSLATE=REGISTRY.register("c3_cobbled_deepslate",()->new Block(c_cobbled_deepslate_props));
	public static final RegistryObject<Block>C4_COBBLED_DEEPSLATE=REGISTRY.register("c4_cobbled_deepslate",()->new Block(c_cobbled_deepslate_props));
	public static final RegistryObject<Block>C5_COBBLED_DEEPSLATE=REGISTRY.register("c5_cobbled_deepslate",()->new Block(c_cobbled_deepslate_props));
	public static final RegistryObject<Block>C6_COBBLED_DEEPSLATE=REGISTRY.register("c6_cobbled_deepslate",()->new Block(c_cobbled_deepslate_props));
	public static final RegistryObject<Block>C7_COBBLED_DEEPSLATE=REGISTRY.register("c7_cobbled_deepslate",()->new Block(c_cobbled_deepslate_props));
	public static final RegistryObject<Block>C8_COBBLED_DEEPSLATE=REGISTRY.register("c8_cobbled_deepslate",()->new Block(c_cobbled_deepslate_props));
	public static final RegistryObject<Block>C9_COBBLED_DEEPSLATE=REGISTRY.register("c9_cobbled_deepslate",()->new Block(c_cobbled_deepslate_props));
}
