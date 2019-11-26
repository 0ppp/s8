object Prg18
{
	def main(args:Array[String])
	{
		val str:Array[String]=Array("Hello Good Morning","Hello Good Night","Hello Good Afternoon");
		var str1=" ";
		
		println("Enter string:");
		str1=Console.readLine();
		for(i<-0 until str.length)
		{
			if(str(i).contains(str1))
			{
				println(str)
			}
		}
		
	}
}

