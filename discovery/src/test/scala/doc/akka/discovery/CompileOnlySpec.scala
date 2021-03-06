/*
 * Copyright (C) 2017 Lightbend Inc. <http://www.lightbend.com>
 */
package doc.akka.discovery

import akka.actor.ActorSystem
import akka.discovery.{ Lookup, ServiceDiscovery }

import scala.concurrent.duration._

object CompileOnlySpec {

  //#loading
  val system = ActorSystem()
  val serviceDiscovery = ServiceDiscovery(system).discovery
  //#loading

  //#simple
  serviceDiscovery.lookup(Lookup("akka.io"), 1.second)
  // Convenience for a Lookup with only a serviceName
  serviceDiscovery.lookup("akka.io", 1.second)
  //#simple

  //#full
  serviceDiscovery.lookup(Lookup("akka.io").withPortName("remoting").withProtocol("tcp"), 1.second)
  //#full

}
