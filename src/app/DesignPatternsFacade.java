package app;

import designpatterns.abstractfactory.AbstractFactoryTester;
import designpatterns.bridge.BridgeTester;
import designpatterns.builder.BuilderTester;
import designpatterns.chainofresponsibility.ChainOfResponsibilityTester;
import designpatterns.composite.CompositeTester;
import designpatterns.facade.FacadeTester;
import designpatterns.flyweight.FlyweightTester;
import designpatterns.mediator.MediatorTester;
import designpatterns.memento.MementoTester;
import designpatterns.prototype.PrototypeTester;
import designpatterns.proxy.ProxyTester;
import designpatterns.state.StateTester;
import designpatterns.visitor.VisitorTester;


public class DesignPatternsFacade {
	private AbstractFactoryTester abstractFactoryTester = new AbstractFactoryTester();
	private BridgeTester bridgeTester = new BridgeTester();
	private BuilderTester builderTester = new BuilderTester();
	private ChainOfResponsibilityTester chainOfResponsibilityTester = new ChainOfResponsibilityTester();
	private CompositeTester compositeTester = new CompositeTester();
	private FacadeTester facadeTester = new FacadeTester();
	private FlyweightTester flyweightTester = new FlyweightTester();
	private MediatorTester mediatorTester = new MediatorTester();
	private MementoTester mementoTester = new MementoTester();
	private PrototypeTester prototypeTester = new PrototypeTester();
	private ProxyTester proxyTester = new ProxyTester();
	private StateTester stateTester = new StateTester();
	private VisitorTester visitorTester = new VisitorTester();
	
	public AbstractFactoryTester getAbstractFactoryTester() {
		return abstractFactoryTester;
	}

	public BridgeTester getBridgeTester() {
		return bridgeTester;
	}

	public BuilderTester getBuilderTester() {
		return builderTester;
	}

	public ChainOfResponsibilityTester getChainOfResponsibilityTester() {
		return chainOfResponsibilityTester;
	}

	public CompositeTester getCompositeTester() {
		return compositeTester;
	}

	public FacadeTester getFacadeTester() {
		return facadeTester;
	}

	public FlyweightTester getFlyweightTester() {
		return flyweightTester;
	}

	public MediatorTester getMediatorTester() {
		return mediatorTester;
	}

	public MementoTester getMementoTester() {
		return mementoTester;
	}

	public PrototypeTester getPrototypeTester() {
		return prototypeTester;
	}

	public ProxyTester getProxyTester() {
		return proxyTester;
	}

	public StateTester getStateTester() {
		return stateTester;
	}

	public VisitorTester getVisitorTester() {
		return visitorTester;
	}
	
	
}
