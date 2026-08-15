package cz.maxtechnik.mtc;

import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

import java.util.Objects;
@SuppressWarnings("removal")
@Mod(MTCMod.MODID)
public class MTCMod{
	public static final String MODID="mtc";
	public static final Logger LOGGER=LogUtils.getLogger();
	public static final DeferredRegister.Items ITEMS=DeferredRegister.createItems(MODID);
	public void registerItems(){
		MTCModBlocks.REGISTRY.getEntries().forEach(block->{
			ITEMS.register(block.getId().getPath(),()->new BlockItem(block.get(),new Item.Properties()));
		});
	}
	public static final DeferredRegister<CreativeModeTab> TABS=DeferredRegister.create(Registries.CREATIVE_MODE_TAB,MODID);
	public static final DeferredHolder<CreativeModeTab,CreativeModeTab> TAB=TABS.register("nadve_tab",()->CreativeModeTab.builder()
			.title(Component.translatable("creative_tab.mtc.blocks"))
			.icon(()->new ItemStack(Objects.requireNonNull(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(MODID,"c2_cobblestone")))))
			.displayItems((parameters,output)->ITEMS.getEntries().forEach(item->output.accept(item.get()))).build());
	public MTCMod(IEventBus bus){
		MTCModBlocks.REGISTRY.register(bus);
		registerItems();
		ITEMS.register(bus);
		TABS.register(bus);
		bus.addListener(this::commonSetup);
		NeoForge.EVENT_BUS.register(this);
	}
	private void commonSetup(final FMLCommonSetupEvent event){
		LOGGER.info("MT-Compressed: Common Setup");
	}
	@SubscribeEvent
	public void onServerStarting(ServerStartingEvent event){
		LOGGER.info("MT-Compressed: Server Starting");
	}
	@EventBusSubscriber(modid=MODID, bus=EventBusSubscriber.Bus.MOD, value=Dist.CLIENT)
	public static class ClientModEvents{
		@SubscribeEvent
		public static void onClientSetup(FMLClientSetupEvent event){
			LOGGER.info("MT-Compressed: Client Setup");
		}
	}
}
