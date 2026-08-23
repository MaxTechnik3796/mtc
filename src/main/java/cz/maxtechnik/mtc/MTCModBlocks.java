package cz.maxtechnik.mtc;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.*;
@SuppressWarnings("unused")
public class MTCModBlocks{
	public static final DeferredRegister.Blocks REGISTRY=DeferredRegister.createBlocks(MTCMod.MODID);
	static BlockBehaviour.Properties c_cobblestone_props=BlockBehaviour.Properties.ofFullCopy(COBBLESTONE);
	public static final DeferredBlock<Block> C1_COBBLESTONE=REGISTRY.registerSimpleBlock("c1_cobblestone",c_cobblestone_props);
	public static final DeferredBlock<Block> C2_COBBLESTONE=REGISTRY.registerSimpleBlock("c2_cobblestone",c_cobblestone_props);
	public static final DeferredBlock<Block> C3_COBBLESTONE=REGISTRY.registerSimpleBlock("c3_cobblestone",c_cobblestone_props);
	public static final DeferredBlock<Block> C4_COBBLESTONE=REGISTRY.registerSimpleBlock("c4_cobblestone",c_cobblestone_props);
	public static final DeferredBlock<Block> C5_COBBLESTONE=REGISTRY.registerSimpleBlock("c5_cobblestone",c_cobblestone_props);
	public static final DeferredBlock<Block> C6_COBBLESTONE=REGISTRY.registerSimpleBlock("c6_cobblestone",c_cobblestone_props);
	public static final DeferredBlock<Block> C7_COBBLESTONE=REGISTRY.registerSimpleBlock("c7_cobblestone",c_cobblestone_props);
	public static final DeferredBlock<Block> C8_COBBLESTONE=REGISTRY.registerSimpleBlock("c8_cobblestone",c_cobblestone_props);
	public static final DeferredBlock<Block> C9_COBBLESTONE=REGISTRY.registerSimpleBlock("c9_cobblestone",c_cobblestone_props);
	static BlockBehaviour.Properties c_dirt_props=BlockBehaviour.Properties.ofFullCopy(DIRT);
	public static final DeferredBlock<Block> C1_DIRT=REGISTRY.registerSimpleBlock("c1_dirt",c_dirt_props);
	public static final DeferredBlock<Block> C2_DIRT=REGISTRY.registerSimpleBlock("c2_dirt",c_dirt_props);
	public static final DeferredBlock<Block> C3_DIRT=REGISTRY.registerSimpleBlock("c3_dirt",c_dirt_props);
	public static final DeferredBlock<Block> C4_DIRT=REGISTRY.registerSimpleBlock("c4_dirt",c_dirt_props);
	public static final DeferredBlock<Block> C5_DIRT=REGISTRY.registerSimpleBlock("c5_dirt",c_dirt_props);
	public static final DeferredBlock<Block> C6_DIRT=REGISTRY.registerSimpleBlock("c6_dirt",c_dirt_props);
	public static final DeferredBlock<Block> C7_DIRT=REGISTRY.registerSimpleBlock("c7_dirt",c_dirt_props);
	public static final DeferredBlock<Block> C8_DIRT=REGISTRY.registerSimpleBlock("c8_dirt",c_dirt_props);
	public static final DeferredBlock<Block> C9_DIRT=REGISTRY.registerSimpleBlock("c9_dirt",c_dirt_props);
	static BlockBehaviour.Properties c_gravel_props=BlockBehaviour.Properties.ofFullCopy(GRAVEL);
	public static final DeferredBlock<Block> C1_GRAVEL=REGISTRY.registerSimpleBlock("c1_gravel",c_gravel_props);
	public static final DeferredBlock<Block> C2_GRAVEL=REGISTRY.registerSimpleBlock("c2_gravel",c_gravel_props);
	public static final DeferredBlock<Block> C3_GRAVEL=REGISTRY.registerSimpleBlock("c3_gravel",c_gravel_props);
	public static final DeferredBlock<Block> C4_GRAVEL=REGISTRY.registerSimpleBlock("c4_gravel",c_gravel_props);
	public static final DeferredBlock<Block> C5_GRAVEL=REGISTRY.registerSimpleBlock("c5_gravel",c_gravel_props);
	public static final DeferredBlock<Block> C6_GRAVEL=REGISTRY.registerSimpleBlock("c6_gravel",c_gravel_props);
	public static final DeferredBlock<Block> C7_GRAVEL=REGISTRY.registerSimpleBlock("c7_gravel",c_gravel_props);
	public static final DeferredBlock<Block> C8_GRAVEL=REGISTRY.registerSimpleBlock("c8_gravel",c_gravel_props);
	public static final DeferredBlock<Block> C9_GRAVEL=REGISTRY.registerSimpleBlock("c9_gravel",c_gravel_props);
	static Supplier<? extends Block> c_deepslate=()->new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(DEEPSLATE));
	public static final DeferredBlock<Block> C1_DEEPSLATE=REGISTRY.register("c1_deepslate",c_deepslate);
	public static final DeferredBlock<Block> C2_DEEPSLATE=REGISTRY.register("c2_deepslate",c_deepslate);
	public static final DeferredBlock<Block> C3_DEEPSLATE=REGISTRY.register("c3_deepslate",c_deepslate);
	public static final DeferredBlock<Block> C4_DEEPSLATE=REGISTRY.register("c4_deepslate",c_deepslate);
	public static final DeferredBlock<Block> C5_DEEPSLATE=REGISTRY.register("c5_deepslate",c_deepslate);
	public static final DeferredBlock<Block> C6_DEEPSLATE=REGISTRY.register("c6_deepslate",c_deepslate);
	public static final DeferredBlock<Block> C7_DEEPSLATE=REGISTRY.register("c7_deepslate",c_deepslate);
	public static final DeferredBlock<Block> C8_DEEPSLATE=REGISTRY.register("c8_deepslate",c_deepslate);
	public static final DeferredBlock<Block> C9_DEEPSLATE=REGISTRY.register("c9_deepslate",c_deepslate);
	static BlockBehaviour.Properties c_cobbled_deepslate_props=BlockBehaviour.Properties.ofFullCopy(COBBLED_DEEPSLATE);
	public static final DeferredBlock<Block> C1_COBBLED_DEEPSLATE=REGISTRY.registerSimpleBlock("c1_cobbled_deepslate",c_cobbled_deepslate_props);
	public static final DeferredBlock<Block> C2_COBBLED_DEEPSLATE=REGISTRY.registerSimpleBlock("c2_cobbled_deepslate",c_cobbled_deepslate_props);
	public static final DeferredBlock<Block> C3_COBBLED_DEEPSLATE=REGISTRY.registerSimpleBlock("c3_cobbled_deepslate",c_cobbled_deepslate_props);
	public static final DeferredBlock<Block> C4_COBBLED_DEEPSLATE=REGISTRY.registerSimpleBlock("c4_cobbled_deepslate",c_cobbled_deepslate_props);
	public static final DeferredBlock<Block> C5_COBBLED_DEEPSLATE=REGISTRY.registerSimpleBlock("c5_cobbled_deepslate",c_cobbled_deepslate_props);
	public static final DeferredBlock<Block> C6_COBBLED_DEEPSLATE=REGISTRY.registerSimpleBlock("c6_cobbled_deepslate",c_cobbled_deepslate_props);
	public static final DeferredBlock<Block> C7_COBBLED_DEEPSLATE=REGISTRY.registerSimpleBlock("c7_cobbled_deepslate",c_cobbled_deepslate_props);
	public static final DeferredBlock<Block> C8_COBBLED_DEEPSLATE=REGISTRY.registerSimpleBlock("c8_cobbled_deepslate",c_cobbled_deepslate_props);
	public static final DeferredBlock<Block> C9_COBBLED_DEEPSLATE=REGISTRY.registerSimpleBlock("c9_cobbled_deepslate",c_cobbled_deepslate_props);
}
