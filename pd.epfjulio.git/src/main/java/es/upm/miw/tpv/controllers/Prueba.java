package es.upm.miw.tpv.controllers;

import es.upm.miw.pd.composite.expression.Expression;

public abstract class Prueba extends Expression {

    private Expression firstExpression;
    
    private Expression secondExpression;
    
    public Prueba(Expression firstExpression, Expression secondExpression){
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    public Expression getFirstExpression() {
        return firstExpression;
    }

    public Expression getSecondExpression() {
        return secondExpression;
    }
}
