package net.runelite.oauth;

import java.util.UUID;

public class State
{
	private UUID uuid;
	private String apiVersion;

	public UUID getUuid()
	{
		return uuid;
	}

	public void setUuid(UUID uuid)
	{
		this.uuid = uuid;
	}

	public String getApiVersion()
	{
		return apiVersion;
	}

	public void setApiVersion(String apiVersion)
	{
		this.apiVersion = apiVersion;
	}
}
