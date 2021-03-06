package blay09.mods.eirairc.config;

import net.minecraftforge.common.ConfigCategory;
import net.minecraftforge.common.Configuration;
import blay09.mods.eirairc.Utils;

public class DisplayFormatConfig {

	public static void defaultConfig(Configuration config, ConfigCategory category) {
		String categoryName = category.getQualifiedName();
		
		/*
		 * CLASSIC
		 */
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "classic", "name", Utils.quote("Classic"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "classic", "mcChannelMessage", Utils.quote("[{CHANNEL}] <{NICK}> {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "classic", "mcChannelEmote", Utils.quote("[{CHANNEL}] * {NICK} {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "classic", "mcPrivateMessage", Utils.quote("[Private] <{NICK}> {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "classic", "mcPrivateEmote", Utils.quote("[Private] * {NICK} {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "classic", "ircChannelMessage", Utils.quote("<{NICK}> {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "classic", "ircChannelEmote", Utils.quote("* {NICK} {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "classic", "ircPrivateMessage", Utils.quote("<{NICK}> {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "classic", "ircPrivateEmote", Utils.quote("* {NICK} {MESSAGE}"));
		
		/*
		 * Light
		 */
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "light", "name", Utils.quote("Light"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "light", "mcChannelMessage", Utils.quote("[ <{NICK}> {MESSAGE} ]"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "light", "mcChannelEmote", Utils.quote("[ * {NICK} {MESSAGE} ]"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "light", "mcPrivateMessage", Utils.quote("[ <{NICK}> {MESSAGE} ]"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "light", "mcPrivateEmote", Utils.quote("[[ {NICK} {MESSAGE} ]]"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "light", "ircChannelMessage", Utils.quote("<{NICK}> {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "light", "ircChannelEmote", Utils.quote("* {NICK} {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "light", "ircPrivateMessage", Utils.quote("<{NICK}> {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "light", "ircPrivateEmote", Utils.quote("* {NICK} {MESSAGE}"));
		
		/*
		 * S-Light
		 */
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "slight", "name", Utils.quote("S-Light"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "slight", "mcChannelMessage", Utils.quote("[{NICK}] {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "slight", "mcChannelEmote", Utils.quote("[ * {NICK} {MESSAGE} ]"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "slight", "mcPrivateMessage", Utils.quote("[[{NICK}]] {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "slight", "mcPrivateEmote", Utils.quote("[[ {NICK} {MESSAGE} ]]"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "slight", "ircChannelMessage", Utils.quote("<{NICK}> {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "slight", "ircChannelEmote", Utils.quote("* {NICK} {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "slight", "ircPrivateMessage", Utils.quote("<{NICK}> {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "slight", "ircPrivateEmote", Utils.quote("* {NICK} {MESSAGE}"));
		
		/*
		 * Minecraft
		 */
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "minecraft", "name", Utils.quote("Minecraft"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "minecraft", "mcChannelMessage", Utils.quote("<{NICK}> {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "minecraft", "mcChannelEmote", Utils.quote("* {NICK} {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "minecraft", "mcPrivateMessage", Utils.quote("[P] <{NICK}> {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "minecraft", "mcPrivateEmote", Utils.quote("[P] * {NICK} {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "minecraft", "ircChannelMessage", Utils.quote("<{NICK}> {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "minecraft", "ircChannelEmote", Utils.quote("* {NICK} {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "minecraft", "ircPrivateMessage", Utils.quote("<{NICK}> {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "minecraft", "ircPrivateEmote", Utils.quote("* {NICK} {MESSAGE}"));
		
		/*
		 * Detail
		 */
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "detail", "name", Utils.quote("Detail"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "detail", "mcChannelMessage", Utils.quote("[{SERVER}/{CHANNEL}] <{NICK}> {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "detail", "mcChannelEmote", Utils.quote("[{SERVER}/{CHANNEL}] * {NICK} {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "detail", "mcPrivateMessage", Utils.quote("[{SERVER}]  <{NICK}> {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "detail", "mcPrivateEmote", Utils.quote("[{SERVER}] * {NICK} {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "detail", "ircChannelMessage", Utils.quote("<{NICK}> {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "detail", "ircChannelEmote", Utils.quote("* {NICK} {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "detail", "ircPrivateMessage", Utils.quote("<{NICK}> {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "detail", "ircPrivateEmote", Utils.quote("* {NICK} {MESSAGE}"));
		
		/*
		 * CUSTOM
		 */
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "custom", "name", Utils.quote("Custom"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "custom", "mcChannelMessage", Utils.quote("[{CHANNEL}] <{NICK}> {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "custom", "mcChannelEmote", Utils.quote("[{CHANNEL}] * {NICK} {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "custom", "mcPrivateMessage", Utils.quote("[Private] <{NICK}> {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "custom", "mcPrivateEmote", Utils.quote("[Private] * {NICK} {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "custom", "ircChannelMessage", Utils.quote("<{NICK}> {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "custom", "ircChannelEmote", Utils.quote("* {NICK} {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "custom", "ircPrivateMessage", Utils.quote("<{NICK}> {MESSAGE}"));
		config.get(categoryName + Configuration.CATEGORY_SPLITTER + "custom", "ircPrivateEmote", Utils.quote("* {NICK} {MESSAGE}"));
		config.getCategory(categoryName + Configuration.CATEGORY_SPLITTER + "custom").setComment("Use this one if you want to customize the way messages are displayed in minecraft / on IRC.");
		
	}
	
	private String categoryName;
	private String name;
	public String mcChannelMessage;
	public String mcChannelEmote;
	public String mcPrivateMessage;
	public String mcPrivateEmote;
	public String ircChannelMessage;
	public String ircChannelEmote;
	public String ircPrivateMessage;
	public String ircPrivateEmote;
	
	public DisplayFormatConfig(ConfigCategory category) {
		categoryName = category.getQualifiedName();
	}
	
	public void load(Configuration config) {
		name = Utils.unquote(config.get(categoryName, "name", "").getString());
		mcChannelMessage = Utils.unquote(config.get(categoryName, "mcChannelMessage", "").getString());
		mcChannelEmote = Utils.unquote(config.get(categoryName, "mcChannelEmote", "").getString());
		mcPrivateMessage = Utils.unquote(config.get(categoryName, "mcPrivateMessage", "").getString());
		mcPrivateEmote = Utils.unquote(config.get(categoryName, "mcPrivateEmote", "").getString());
		
		ircChannelMessage = Utils.unquote(config.get(categoryName, "ircChannelMessage", "").getString());
		ircChannelEmote = Utils.unquote(config.get(categoryName, "ircChannelEmote", "").getString());
		ircPrivateMessage = Utils.unquote(config.get(categoryName, "ircPrivateMessage", "").getString());
		ircPrivateEmote = Utils.unquote(config.get(categoryName, "ircPrivateEmote", "").getString());
	}
	
	public String getName() {
		return name;
	}
	
}
