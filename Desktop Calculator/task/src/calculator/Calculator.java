package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;


public class Calculator extends JFrame {
    private static final int WINDOW_WIDTH = 300;
    private static final int WINDOW_HEIGHT = 500;
    private static final int BUTTON_WIDTH = 60;
    private static final int BUTTON_HEIGHT = 40;
    private static final int BUTTON_SEPARATION = 10;
    private static final int BUTTON_INITIAL_X = 10;
    private static final int BUTTON_INITIAL_Y = 80;
    private static int parenthesis = 0;

    private void initialize() {

        Font font = new Font("Arial", Font.PLAIN, 12);


        JLabel resultLabel = new JLabel();
        resultLabel.setName("ResultLabel");
        resultLabel.setBounds(10, 20, WINDOW_WIDTH - 35, 60);
        Font fontResult = new Font("Resultado", Font.BOLD, 36);
        resultLabel.setFont(fontResult);
        resultLabel.setHorizontalAlignment(4);
        resultLabel.setText("0");

        JLabel equationLabel = new JLabel();
        equationLabel.setName("EquationLabel");
        equationLabel.setFont(font);
        equationLabel.setBounds(10, 80, WINDOW_WIDTH - 35, 30);
        equationLabel.setHorizontalAlignment(4);
        equationLabel.setForeground(Color.GREEN);

        JButton sevenButton = new JButton("7");
        sevenButton.setName("Seven");
        sevenButton.setBounds(BUTTON_INITIAL_X, BUTTON_INITIAL_Y + 3 * BUTTON_SEPARATION + 3 * BUTTON_HEIGHT , BUTTON_WIDTH, BUTTON_HEIGHT);
        sevenButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                equationLabel.setText(equationLabel.getText() + "7");
            }
        });

        JButton eightButton = new JButton("8");
        eightButton.setName("Eight");
        eightButton.setBounds(BUTTON_INITIAL_X + BUTTON_SEPARATION + BUTTON_WIDTH, BUTTON_INITIAL_Y + 3 * BUTTON_SEPARATION + 3 * BUTTON_HEIGHT, BUTTON_WIDTH, BUTTON_HEIGHT);
        eightButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                equationLabel.setText(equationLabel.getText() + "8");
            }
        });

        JButton nineButton = new JButton("9");
        nineButton.setName("Nine");
        nineButton.setBounds(BUTTON_INITIAL_X + 2 * BUTTON_SEPARATION + 2 * BUTTON_WIDTH, BUTTON_INITIAL_Y + 3 * BUTTON_SEPARATION +  3 * BUTTON_HEIGHT, BUTTON_WIDTH, BUTTON_HEIGHT);
        nineButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                equationLabel.setText(equationLabel.getText() + "9");
            }
        });

        JButton fourButton = new JButton("4");
        fourButton.setName("Four");
        fourButton.setBounds(BUTTON_INITIAL_X, BUTTON_INITIAL_Y + 4 * BUTTON_SEPARATION + 4 * BUTTON_HEIGHT, BUTTON_WIDTH, BUTTON_HEIGHT);
        fourButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                equationLabel.setText(equationLabel.getText() + "4");
            }
        });

        JButton fiveButton = new JButton("5");
        fiveButton.setName("Five");
        fiveButton.setBounds(BUTTON_INITIAL_X + BUTTON_SEPARATION + BUTTON_WIDTH, BUTTON_INITIAL_Y + 4 * BUTTON_SEPARATION + 4 * BUTTON_HEIGHT, BUTTON_WIDTH, BUTTON_HEIGHT);
        fiveButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                equationLabel.setText(equationLabel.getText() + "5");
            }
        });

        JButton sixButton = new JButton("6");
        sixButton.setName("Six");
        sixButton.setBounds(BUTTON_INITIAL_X + 2 * BUTTON_SEPARATION + 2 * BUTTON_WIDTH, BUTTON_INITIAL_Y + 4 * BUTTON_SEPARATION + 4 * BUTTON_HEIGHT, BUTTON_WIDTH, BUTTON_HEIGHT);
        sixButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                equationLabel.setText(equationLabel.getText() + "6");
            }
        });

        JButton oneButton = new JButton("1");
        oneButton.setName("One");
        oneButton.setBounds(BUTTON_INITIAL_X, BUTTON_INITIAL_Y + 5 * BUTTON_SEPARATION + 5 * BUTTON_HEIGHT, BUTTON_WIDTH, BUTTON_HEIGHT);
        oneButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                equationLabel.setText(equationLabel.getText() + "1");
            }
        });

        JButton twoButton = new JButton("2");
        twoButton.setName("Two");
        twoButton.setBounds(BUTTON_INITIAL_X + BUTTON_SEPARATION + BUTTON_WIDTH, BUTTON_INITIAL_Y + 5 * BUTTON_SEPARATION + 5 * BUTTON_HEIGHT, BUTTON_WIDTH, BUTTON_HEIGHT);
        twoButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                equationLabel.setText(equationLabel.getText() + "2");
            }
        });

        JButton threeButton = new JButton("3");
        threeButton.setName("Three");
        threeButton.setBounds(BUTTON_INITIAL_X + 2 * BUTTON_SEPARATION + 2 * BUTTON_WIDTH, BUTTON_INITIAL_Y + 5 * BUTTON_SEPARATION + 5 * BUTTON_HEIGHT, BUTTON_WIDTH, BUTTON_HEIGHT);
        threeButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                equationLabel.setText(equationLabel.getText() + "3");
            }
        });

        JButton zeroButton = new JButton("0");
        zeroButton.setName("Zero");
        zeroButton.setBounds(BUTTON_INITIAL_X +  BUTTON_SEPARATION +  BUTTON_WIDTH, BUTTON_INITIAL_Y + 6 * BUTTON_SEPARATION + 6 * BUTTON_HEIGHT, BUTTON_WIDTH, BUTTON_HEIGHT);
        zeroButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                equationLabel.setText(equationLabel.getText() + "0");
            }
        });

        JButton dotButton = new JButton(".");
        dotButton.setName("Dot");
        dotButton.setBounds(BUTTON_INITIAL_X + 2 * BUTTON_SEPARATION + 2 * BUTTON_WIDTH, BUTTON_INITIAL_Y + 6 * BUTTON_SEPARATION + 6 * BUTTON_HEIGHT, BUTTON_WIDTH, BUTTON_HEIGHT);
        dotButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                equationLabel.setText(equationLabel.getText() + ".");
            }
        });

        JButton addButton = new JButton("+");
        addButton.setName("Add");
        addButton.setBounds(BUTTON_INITIAL_X + 3 * BUTTON_SEPARATION + 3 * BUTTON_WIDTH, BUTTON_INITIAL_Y + 2 * BUTTON_SEPARATION + 2 * BUTTON_HEIGHT, BUTTON_WIDTH, BUTTON_HEIGHT);
        addButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionButton(equationLabel, "+");
            }

        });

        JButton substractButton = new JButton("-");
        substractButton.setName("Subtract");
        substractButton.setBounds(BUTTON_INITIAL_X + 3 * BUTTON_SEPARATION + 3 * BUTTON_WIDTH, BUTTON_INITIAL_Y + 3 * BUTTON_SEPARATION + 3 * BUTTON_HEIGHT, BUTTON_WIDTH, BUTTON_HEIGHT);
        substractButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionButton(equationLabel, "-");
            }
        });

        JButton divideButton = new JButton("/");
        divideButton.setName("Divide");
        divideButton.setBounds(BUTTON_INITIAL_X + 3 * BUTTON_SEPARATION + 3 * BUTTON_WIDTH, BUTTON_INITIAL_Y + 4 * BUTTON_SEPARATION + 4 * BUTTON_HEIGHT, BUTTON_WIDTH, BUTTON_HEIGHT);
        divideButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionButton(equationLabel, "÷");
            }
        });

        JButton multiplyButton = new JButton("*");
        multiplyButton.setName("Multiply");
        multiplyButton.setBounds(BUTTON_INITIAL_X + 3 * BUTTON_SEPARATION + 3 * BUTTON_WIDTH, BUTTON_INITIAL_Y + 5 * BUTTON_SEPARATION + 5 * BUTTON_HEIGHT, BUTTON_WIDTH, BUTTON_HEIGHT);
        multiplyButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionButton(equationLabel, "×");
            }
        });

        JButton squareButton = new JButton("√");
        squareButton.setName("SquareRoot");
        squareButton.setFont(font);
        squareButton.setBounds(BUTTON_INITIAL_X + 2 * BUTTON_SEPARATION + 2 * BUTTON_WIDTH, BUTTON_INITIAL_Y + 2 * BUTTON_SEPARATION + 2 * BUTTON_HEIGHT, BUTTON_WIDTH, BUTTON_HEIGHT);
        squareButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                equationLabel.setText(equationLabel.getText() + "√(");
                parenthesis++;
            }
        });


        JButton powerTwoButton = new JButton("<html>x<sup>2</sup></html>");
        powerTwoButton.setName("PowerTwo");
        powerTwoButton.setBounds(BUTTON_INITIAL_X , BUTTON_INITIAL_Y + 2 * BUTTON_SEPARATION + 2 * BUTTON_HEIGHT, BUTTON_WIDTH, BUTTON_HEIGHT);
        powerTwoButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                equationLabel.setText(equationLabel.getText() + "^(2)");
            }
        });

        JButton powerYButton = new JButton("<html>x<sup>y</sup></html>");
        powerYButton.setName("PowerY");
        powerYButton.setBounds(BUTTON_INITIAL_X +  BUTTON_SEPARATION +  BUTTON_WIDTH, BUTTON_INITIAL_Y + 2 * BUTTON_SEPARATION + 2 * BUTTON_HEIGHT, BUTTON_WIDTH, BUTTON_HEIGHT);
        powerYButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                equationLabel.setText(equationLabel.getText() + "^");
            }
        });

        JButton plusMinusButton = new JButton("±");
        plusMinusButton.setName("PlusMinus");
        plusMinusButton.setBounds(BUTTON_INITIAL_X , BUTTON_INITIAL_Y + 6 * BUTTON_SEPARATION + 6 * BUTTON_HEIGHT, BUTTON_WIDTH, BUTTON_HEIGHT);
        plusMinusButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (equationLabel.getText().matches("\\(-\\d+\\)")) {
                    equationLabel.setText(equationLabel.getText().substring(2, equationLabel.getText().length() - 1));
                } else if (equationLabel.getText().matches("\\(-\\(.*\\)\\)")) {
                    equationLabel.setText(equationLabel.getText().substring(3, equationLabel.getText().length() - 2));
                } else if (equationLabel.getText().isEmpty()) {
                    equationLabel.setText("(-");
                    parenthesis++;
                } else if (equationLabel.getText().equals("(-")) {
                    equationLabel.setText("");
                    parenthesis--;
                } else if (equationLabel.getText().matches("\\(-\\d+")) {
                    equationLabel.setText(equationLabel.getText().substring(2));
                    parenthesis--;
                } else {
                    equationLabel.setText("(-" + equationLabel.getText() );
                }


            }
        });

        JButton parenthesisButton = new JButton("()");
        parenthesisButton.setName("Parentheses");
        parenthesisButton.setBounds(BUTTON_INITIAL_X , BUTTON_INITIAL_Y + BUTTON_SEPARATION + BUTTON_HEIGHT, BUTTON_WIDTH, BUTTON_HEIGHT);
        parenthesisButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (parenthesis == 0) {
                    equationLabel.setText(equationLabel.getText() + "(");
                    parenthesis++;
                } else {
                    System.out.println(equationLabel.getText().substring(equationLabel.getText().length() - 1, equationLabel.getText().length() ));
                    if ((equationLabel.getText().substring(equationLabel.getText().length() - 1, equationLabel.getText().length()).equals("(")) ||
                            (equationLabel.getText().substring(equationLabel.getText().length() - 1, equationLabel.getText().length()).matches(".*[+\\-÷×^].*")))
                    {
                        equationLabel.setText(equationLabel.getText() + "(");
                        parenthesis++;
                    } else {
                        equationLabel.setText(equationLabel.getText() + ")");
                        parenthesis--;
                    }
                }
            }
        });

        JButton clearButton = new JButton("C");
        clearButton.setName("Clear");
        clearButton.setBounds(BUTTON_INITIAL_X + 2 * BUTTON_SEPARATION + 2 * BUTTON_WIDTH, BUTTON_INITIAL_Y + BUTTON_SEPARATION + BUTTON_HEIGHT, BUTTON_WIDTH, BUTTON_HEIGHT);
        clearButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                equationLabel.setText("");
                resultLabel.setText("0");
                parenthesis = 0;
            }
        });

        JButton deleteButton = new JButton("Del");
        deleteButton.setName("Delete");
        deleteButton.setBounds(BUTTON_INITIAL_X + 3 * BUTTON_SEPARATION + 3 * BUTTON_WIDTH, BUTTON_INITIAL_Y +  BUTTON_SEPARATION +   BUTTON_HEIGHT, BUTTON_WIDTH, BUTTON_HEIGHT);
        deleteButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (equationLabel.getText().length() > 0) {
                    if (equationLabel.getText().substring(equationLabel.getText().length() - 1, equationLabel.getText().length()).equals("(")) {
                        parenthesis--;
                    } else if (equationLabel.getText().substring(equationLabel.getText().length() - 1, equationLabel.getText().length()).equals(")")) {
                        parenthesis++;
                    }
                    equationLabel.setText(equationLabel.getText().substring(0, equationLabel.getText().length() - 1));
                }
            }
        });

        JButton solveButton = new JButton("=");
        solveButton.setName("Equals");
        solveButton.setBounds(BUTTON_INITIAL_X + 3 * BUTTON_SEPARATION + 3 * BUTTON_WIDTH, BUTTON_INITIAL_Y + 6 * BUTTON_SEPARATION + 6 * BUTTON_HEIGHT, BUTTON_WIDTH, BUTTON_HEIGHT);
        solveButton.addActionListener(event -> solve(equationLabel, resultLabel));

        setLayout(null);
        add(equationLabel);
        add(resultLabel);
        add(sevenButton);
        add(eightButton);
        add(nineButton);
        add(fourButton);
        add(fiveButton);
        add(sixButton);
        add(oneButton);
        add(twoButton);
        add(threeButton);
        add(zeroButton);
        add(addButton);
        add(substractButton);
        add(divideButton);
        add(multiplyButton);
        add(dotButton);
        add(clearButton);
        add(deleteButton);
        add(solveButton);
        add(parenthesisButton);
        add(squareButton);
        add(powerTwoButton);
        add(powerYButton);
        add(plusMinusButton);
    }

    public Calculator() {
        super("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocationRelativeTo(null);
        initialize();
        setVisible(true);
    }

    private void actionButton(JLabel equationLabel, String symbol) {
        if (!equationLabel.getText().isEmpty()) {
            if (equationLabel.getText().matches(".*[+\\-÷×^]$")) {
                equationLabel.setText(equationLabel.getText().substring(0, equationLabel.getText().length() - 1) + symbol);
            } else {
                if (equationLabel.getText().matches("^((.*[^0-9]\\.\\d+)|(\\.\\d+))")){
                    equationLabel.setText(equationLabel.getText().substring(0, equationLabel.getText().lastIndexOf("."))
                            + "0" + equationLabel.getText().substring(equationLabel.getText().lastIndexOf(".") , equationLabel.getText().length() ));
                }
                if (equationLabel.getText().matches(".*[0-9]*\\.$")){
                    equationLabel.setText(equationLabel.getText().concat("0"));
                }
                equationLabel.setText(equationLabel.getText() + symbol);
            }
        }
    }


    private void solve(JLabel equationLabel, JLabel resultLabel) {
        if (validEquation(equationLabel.getText())) {
            actionButton(equationLabel, "");
            String postfixExpression = infixToPostfix(equationLabel.getText());
            //String postfixExpression = infixToPostfix("5+2*3");
            System.out.println("infix: " + equationLabel.getText());
            //System.out.println("infix: " + "5+2*3");
            System.out.println("postfix: " + postfixExpression);
            if (!postfixExpression.equals("Invalid expression")) {
                resultLabel.setText(evaluatePostfix(postfixExpression));
            } else {
                System.out.println("Invalid expression");
            }
        } else {
            equationLabel.setForeground(Color.RED.darker());
        }
    }

    private boolean validEquation(String equation) {
        // Si termina en un operando o hay una division por 0
        // dara false
        if (!equation.matches(".*[+\\-÷×^]$")
        && !equation.matches(".*÷0[+\\-÷×^]?.*")) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isOperand(char c) {
        return c == '+' || c == '-' || c == '×' || c == '÷' || c == '^' || c == '√';
    }

    // Función para determinar la precedencia de los operandos
    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '×':
            case '÷':
                return 2;

            case '^':
                return 3;
            case '√':
                return 3;
        }
        return -1;
    }


    // Método para convertir infix a postfix
    public  String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c) || c == '.') {
                StringBuilder num = new StringBuilder();
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.' )) {
                    num.append(expression.charAt(i));
                    i++;
                }
                result.append(num).append(" ");
                i--; // Decrement i to account for the increment in the loop
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop()).append(" ");
                }
                stack.pop();
            } else if (isOperand(c)) {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop()).append(" ");
                }
                stack.push(c);
            }  else if (c == '-' && (i == 0 || expression.charAt(i - 1) == '(')) {
                // Handle negative numbers at the beginning or after an opening parenthesis
                result.append("-1 ").append("× ");
                stack.push('*');
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop()).append(" ");
        }

        return result.toString().trim();

    }

    // Método para hacer el cálculo de las operaciones con el formato postfix
    public  String evaluatePostfix(String postfix) {
        Stack<Float> stack = new Stack<>();
        String[] tokens = postfix.split(" ");

        for (String token : tokens) {
            // Si el token es un número, va al stack
            if (token.matches("-?\\d+.?\\d*")) {
                stack.push(Float.parseFloat(token));
            } else if (token.matches("√")) {
                float val1 = stack.pop();
                stack.push((float) Math.sqrt(val1));
            }

            //Si no, debe ser un operador
            else {

                float val1 = stack.pop();
                if (stack.isEmpty()) {
                    //Operador unitario
                    switch (token) {
                        case "+":
                            stack.push(val1);
                            break;
                        case "-":
                            stack.push(-val1);
                            break;
                        default:
                            return "Error: Invalid Operator";
                    }
                } else {
                    float val2 = stack.pop();

                    switch (token) {
                        case "+":
                            stack.push(val2 + val1);
                            break;
                        case "-":
                            stack.push(val2 - val1);
                            break;
                        case "×":
                            stack.push(val2 * val1);
                            break;
                        case "÷":
                            stack.push(val2 / val1);
                            break;
                        case "^":
                            double val1d = val1;
                            double val2d = val2;
                            stack.push((float) Math.pow(val2d, val1d));
                            break;
                    }
                }
            }
        }

        String resultado = stack.pop().toString();
        //Si el resultado tiene parte decimal 0 se mostrará sólo
        //la parte entera
        String[] partes = resultado.split("\\.");
        if (partes[1].equals("0")) {
            return partes[0];
        } else {
            return resultado; // El resultado está en el top del stack
        }

    }

}
