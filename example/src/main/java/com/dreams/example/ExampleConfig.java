package com.dreams.example;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup("Example")
public interface ExampleConfig extends Config {
	@ConfigSection(name = "General", description = "General settings", position = 1, closedByDefault = false)
	String generalSettings = "generalSettings";

	@ConfigItem(keyName = "Example", name = "Example", description = "Example", position = 1, section = generalSettings)
	default boolean example() {
		return true;
	}
}