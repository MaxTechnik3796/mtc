package cz.maxtechnik.mtc;

import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

import java.util.Objects;
@SuppressWarnings("removal")
@Mod(MtcMod.MODID)
public class MtcMod{
	public static final String MODID="mtc";
	public static final Logger LOGGER=LogUtils.getLogger();
	public static final DeferredRegister<Item> ITEMS=DeferredRegister.create(ForgeRegistries.ITEMS,MtcMod.MODID);
	public void registerItems(){
		MtcModBlocks.REGISTRY.getEntries().forEach(block->{
			assert block.getId()!=null;
			ITEMS.register(block.getId().getPath(),()->new BlockItem(block.get(),new Item.Properties()));
		});
	}
	public static final DeferredRegister<CreativeModeTab>TABS=DeferredRegister.create(Registries.CREATIVE_MODE_TAB,MODID);
	public static final RegistryObject<CreativeModeTab>TAB=TABS.register("nadve_tab",()->CreativeModeTab.builder()
			.title(Component.translatable("creative_tab.mtc.blocks"))
			.icon(()->new ItemStack(Objects.requireNonNull(ForgeRegistries.ITEMS.getValue(ResourceLocation.fromNamespaceAndPath("mtc","c2_cobblestone")))))
			.displayItems((parameters, output) ->ITEMS.getEntries().forEach(item -> output.accept(item.get()))).build());
	public MtcMod(){
		IEventBus bus=FMLJavaModLoadingContext.get().getModEventBus();
		MtcModBlocks.REGISTRY.register(bus);
		registerItems();
		ITEMS.register(bus);
		TABS.register(bus);
		bus.addListener(this::commonSetup);
		MinecraftForge.EVENT_BUS.register(this);
	}
	private void commonSetup(final FMLCommonSetupEvent event){
		LOGGER.info("MT-Compressed: Common Setup");
	}
	@SubscribeEvent
	public void onServerStarting(ServerStartingEvent event){
		LOGGER.info("MT-Compressed: Server Starting");
	}
	@Mod.EventBusSubscriber(modid=MODID,bus=Mod.EventBusSubscriber.Bus.MOD,value=Dist.CLIENT)
	public static class ClientModEvents{
		@SubscribeEvent
		public static void onClientSetup(FMLClientSetupEvent event){
			LOGGER.info("MT-Compressed: Client Setup");
		}
	}
}
