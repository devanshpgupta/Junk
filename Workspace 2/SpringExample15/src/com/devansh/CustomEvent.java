package com.devansh;

import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AudioClip;
import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

	public CustomEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	
public String toString()
{
	return "My Custom String";
}

	

}
