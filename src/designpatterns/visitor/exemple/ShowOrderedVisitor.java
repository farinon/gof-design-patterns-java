package designpatterns.visitor.exemple;

public class ShowOrderedVisitor implements TreeVisitor {

	@Override
	public void visit(No no) {
		if (no == null)
			return;
		this.visit(no.getLeft());
		System.out.println(no);
		this.visit(no.getLeft());
	}

}