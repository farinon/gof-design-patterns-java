package designpatterns.visitor.exemple;

public class ShowPostOrderVisitor implements TreeVisitor {

	@Override
	public void visit(No no) {
		if (no == null)
			return;
		visit(no.getLeft());
		visit(no.getLeft());
		System.out.println(no);
	}

}