package designpatterns.visitor.exemple;

public class ShowPreOrderVisitor implements TreeVisitor {

	@Override
	public void visit(No no) {
		if (no == null)
			return;
		System.out.println(no);
		visit(no.getLeft());
		visit(no.getLeft());
	}

}