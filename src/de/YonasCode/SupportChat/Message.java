package de.YonasCode.SupportChat;

import org.bukkit.ChatColor;

public class Message {
	
	public static final String TAG 				= "§6[§4Support§6-§9Chat§6]";
	public static final String NO_PERMISSIONS 	= ChatColor.RED + "Du besitzt nicht die erforderten Berechtungen, um diesen Befehl zu benutzen!";
	public static final String MORE_WORDS			= ChatColor.RED + "Erfordert mindestens ein Argument (Wort), um den Support zu informieren. Bei einer Frage kannst du mehrere Argumente angeben.";
	public static final String IN_WAITLIST		= ChatColor.RED + "Du bist schon in der Warteliste, Gedulde dich, bis ein Supporter auf dich zukommt!";
	public static final String ADDED_WAITLIST 	= ChatColor.GREEN + "Du hast ein Ticket in der Warteliste erstellt, ein Supporter wird dir bald helfen.";
	public static final String ALREADY_IN_CHAT 	= ChatColor.RED + "Du bist schon in einem SupportChat, beende diesen, um in einen anderen zu wechseln.";
	public static final String EMPTY_WAITLIST	= ChatColor.GREEN + "Die Warteliste ist leer. Bisher keine Arbeit :)";
	public static final String LEAVE_CHAT		= ChatColor.GREEN + "Der SupportChat wurde erfolgreich geschlossen.";
	public static final String NEED_SUPPORTER	= ChatColor.RED + "Du musst ein Supporter sein, um ein Ticket zu akzeptieren.";
	public static final String NEED_CHAT		= ChatColor.RED + "Du musst in einem SupportChat sein, um diesen Befehl zu benutzen.";
	
}
