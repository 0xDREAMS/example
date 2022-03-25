package com.dreams.example;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import org.pf4j.Extension;

import javax.inject.Inject;

@Extension
@PluginDescriptor(
		name = "Example",
		description = "Example"
)

@Slf4j
public class Example extends Plugin {

	@Inject
	private Client client;
	
	@Inject
	private ExampleConfig config;

	@Override
	protected void startUp() {

	}
}
