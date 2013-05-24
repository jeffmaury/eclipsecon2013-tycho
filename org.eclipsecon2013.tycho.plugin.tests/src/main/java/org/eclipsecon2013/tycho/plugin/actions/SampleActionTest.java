package org.eclipsecon2013.tycho.plugin.actions;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class SampleActionTest {

	private static SWTWorkbenchBot bot;
	
	@BeforeClass
	public static void setup() {
		bot = new SWTWorkbenchBot();
	}
	
	@Test
	public void verifyThatRootMenuIsAvailable() {
		bot.menu("Sample Menu");
	}
	
	@Test
	public void verifyThatSubMenuIsAvailable() {
		bot.menu("Sample Menu").click().menu("Sample Action");
	}
}
