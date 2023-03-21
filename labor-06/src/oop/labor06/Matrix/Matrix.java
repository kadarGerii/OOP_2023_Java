package oop.labor06.Matrix;

import java.util.Random;

public class Matrix {
    private double[][] data;
    private final int rows;
    private final int columns;
    public Matrix(int rows, int columns){
        this.columns = columns;
        this.rows = rows;
        this.data = new double[rows][columns];
    }
    public Matrix (double[][] data){
        this.data = data;
        this.rows = data.length;
        this.columns = data[0].length;
    }
    public Matrix(Matrix matrix){
        this.rows = matrix.rows;
        this.columns = matrix.columns;
        this.data = matrix.data;
    }
    public void fillRandom(double min, double max){
        Random random = new Random();
        for(int i = 0; i < getRows(); ++i){
            for (int j = 0; j < getColumns(); j++) {
                this.data[i][j] = min + (max - min) * random.nextDouble();
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }
    public void printMatrix(){
        try {
            for (int i = 0; i < getRows(); i++) {
                for (int j = 0; j < getColumns(); j++) {
                    System.out.printf("%.2f ", this.data[i][j]);
                }
                System.out.println();
            }
        }
        catch (NullPointerException e){
            throw (e);
        }
    }
    public static Matrix add(Matrix m1, Matrix m2){
        if(m1.getColumns() != m2.getColumns() || m1.getRows() != m2.getRows()){
            System.out.println("ERROR!");
            return null;
        }
        Matrix m3 = new Matrix(m1.rows, m2.columns);
        for (int i = 0; i < m3.getRows(); i++) {
            for (int j = 0; j < m3.getColumns(); j++) {
                m3.data[i][j] = m2.data[i][j] + m1.data[i][j];
            }
        }
        return m3;
    }
    public static Matrix multiply(Matrix m1, Matrix m2){
        if(m1.getColumns() != m2.getRows()){
            System.out.println("INCOMPATIBLE");
            return null;
        }
        Matrix m3 = new Matrix(m1.getRows(), m2.columns);
        for (int i = 0; i < m3.rows; i++) {
            for (int j = 0; j < m3.getColumns(); j++) {
                for (int k = 0; k < m2.rows; k++) {
                    m3.data[i][j] += m1.data[i][k] * m2.data[k][j];
                }
            }
        }
        return m3;
    }
    public static Matrix transpose(Matrix m){
        Matrix m1 = new Matrix(m.getColumns(), m.getRows());
        for (int i = 0; i < m1.getRows(); i++) {
            for (int j = 0; j < m1.getColumns(); j++) {
                m1.data[i][j] = m.data[j][i];
            }
        }
        return m1;
    }
}
