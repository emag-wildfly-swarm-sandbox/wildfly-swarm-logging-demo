package wildflyswarm.logging;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.wildfly.swarm.container.Container;
import org.wildfly.swarm.jaxrs.JAXRSArchive;
import org.wildfly.swarm.logging.LoggingFraction;

public class App {

  public static void main(String[] args) throws Exception {
    Container container = new Container();

    LoggingFraction loggingFraction = LoggingFraction.createDefaultLoggingFraction();

    JAXRSArchive deployment = ShrinkWrap.create(JAXRSArchive.class);
    deployment.addPackage(App.class.getPackage());

    container.start().deploy(deployment);
  }

}
