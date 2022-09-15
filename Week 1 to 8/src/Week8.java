public class Week8 {
	
static boolean isSameBSTUtil (int a[], int b[], int n, int i1, int i2, int min, int max)
{
   int j, k;
   for (j = i1; j < n; j++)
   if (a[j] > min && a[j] < max)
	   break;
   for (k = i2; k < n ; k++)
	   if (b [k] > min && b[k] < max)
		   break;
   if (j == n && k ==n)
	   return true;
   if (((j==n)^(k==n)) || a [j]!=b[k])
	   return false;
   return isSameBSTUtil(a, b, n, j+1, k+1, a[j], max) &&
		   isSameBSTUtil(a, b, n, j+1, k+1, min, a[j]);
}

static boolean isSameBST(int a[], int b[], int n)
{
	return isSameBSTUtil(a, b, n, 0, 0,
			Integer.MIN_VALUE,Integer.MAX_VALUE);
}
public static void main(String[] args)
{
	int a[] = {15,25,20,22,30,18,10,8,9,12,6};
	int b[] = {15,10,12,8,25,30,6,20,18,9,22};
	int n=a.length;
	System.out.printf("%s\n", isSameBST(a, b, n)?
	"True":"False");
}
}