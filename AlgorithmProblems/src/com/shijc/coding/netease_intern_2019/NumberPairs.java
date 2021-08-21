package com.shijc.coding.netease_intern_2019;

import java.util.Scanner;

/**
 * 5.数对
 * 时间限制：1秒
 * 空间限制：32768K
 * 牛牛以前在老师那里得到了一个正整数数对(x, y), 牛牛忘记他们具体是多少了。
 * 但是牛牛记得老师告诉过他x和y均不大于n, 并且x除以y的余数大于等于k。
 * 牛牛希望你能帮他计算一共有多少个可能的数对。
 * 输入描述:
 * 输入包括两个正整数n,k(1 <= n <= 10^5, 0 <= k <= n - 1)。
 * 输出描述:
 * 对于每个测试用例, 输出一个正整数表示可能的数对数量。
 * 输入例子1:
 * 5 2
 * 输出例子1:
 * 7
 *
 * @author shijiacheng
 * @date 2018/04/04
 */
public class NumberPairs {
    /**
     * 因为x%y==k，则y的取值范围为(k,n]，则y确定时，x在其区间【0，n】内可取（n/y）个模等价区间，
     * 其中有y-k个值符合x的定义。则有（n/y）*（y-k）个。
     * 在最后一段区间n%y中，若n%y>=k,则有n%y-k+1个值符合，故sum+=(n/y)*(y-k)+(n%y>=k?n%y-k+1:0);
     * 当k==0时，x，y可取n内任一值，故有n*n种。
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        long result = 0;
        if (k == 0){
            result = n* n;
        }else {
            for (long i = k+1; i <= n; i++) {
                result+=(n/i)*(i-k)+Math.max(n%i-k+1,0);
            }
        }

        System.out.println(result);
    }
}
