import java.util.Scanner;
class node
{
int data;
Node next;
Node(int data)
{
this.data=data;
this.next=null;
}
}
class ll
{
Scanner s=new Scanner(System.in);
Node Create()
{
Node head=null;
int data=s.nextInt();
while(data!=-1)
{
Node n=new Node(data)
if(head==null)
{
head=n;
}
else
{
Node temp=head;
while(temp.next!=null)
{
temp=temp.next;
temp.next=n;
}
}
data=s.nextInt();
}
return head;
}

void print(head)
{
while(head!=null)
{
print(head.data +"");
}
}
public static void main(String args[])
{
ll n1=new ll();
n1.Create();
}