import java.util.Random;

public class ByteGenerator
{
public static void main(String[] args)
{
int size = Integer.parseInt(args[0]);

byte[] b = new byte[size];
new Random().nextBytes(b);

for(int i = 0;i < b.length; i++)
{
System.out.print(b[i]);
}
System.out.println("");
}

}
