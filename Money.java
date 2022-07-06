class Money
{
	private int rupees;
	private int paisa;

	public void set(int r,int p)
	{
		rupees = r;
		paisa = p;
	}
	public void show()
	{
		System.out.print("Rs :"+rupees+"."+paisa);
	}
}
