package hr.udruga01.arhixml;

import hr.udruga01.arhixml.modules.mainwindow.MainWindow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vaadin.Application;
import com.vaadin.ui.Window;

/**
 * Class handles services provided by the framework such as starting and stopping application.
 */
public class ArhiXMLApplication extends Application {
    private static final long serialVersionUID = 1L;
    private final Logger logger = LoggerFactory.getLogger(ArhiXMLApplication.class.getName());

    /**
     * This is the application entry point. The framework calls this method once
     * for each session. This is where the application is creating the main
     * window, setups the components and event listeners.
     */
    @Override
    public void init() {
        logger.trace("Entering init()");
        logger.debug("Initializing application");
        logger.debug("Setting the application theme");
        setTheme("arhixml");
        Window mainWindow = new MainWindow("ArhiXML");
        setMainWindow(mainWindow);
        logger.debug("Application sucesfully initialized");
        logger.trace("Exiting init()");
    }
}
