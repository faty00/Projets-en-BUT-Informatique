public class Division extends Operation
{

    public Division(Expression op1, Expression op2){
        super(op1,op2);
    }

    public int valeur() {
        return this.getOperande1().valeur() / this.getOperande2().valeur();
    }

    public String toString(){
        return "("+getOperande1()+" / "+getOperande2()+")";
    }
}
