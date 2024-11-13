//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
import java.util.Scanner;

import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Float row = input.nextFloat();//输入圆的半径
        System.out.println(row);
        Double S;
        S = PI * row *row;
        System.out.println("圆的面积是"+S);
    }
}