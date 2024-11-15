package io.thimblebird.cpic;

import com.mojang.brigadier.Command;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import static net.fabricmc.fabric.api.client.command.v2.ClientCommandManager.literal;

import com.simibubi.create.foundation.gui.ScreenOpener;
import com.simibubi.create.foundation.ponder.ui.PonderTagIndexScreen;

public class PonderIndexCommand implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ClientCommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess) -> {
			dispatcher.register(literal("cpic").executes(ctx -> {
				ScreenOpener.transitionTo(new PonderTagIndexScreen());

				return Command.SINGLE_SUCCESS;
			}));
		}));
	}
}
