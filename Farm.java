class Farm 
{     
	private Animal[] dongwu = new Animal[3];    
    public Farm()     {       
        dongwu[0] = new NamedCow("cow","Kat","moo");           
        dongwu[1] = new Chick("chick","chirp","cheep");       
    	dongwu[2] = new Pig("pig","oink");    }         
    public void animalSounds()    
    {       
    	for (int nI=0; nI < dongwu.length; nI++)       
    	{          
       		System.out.println( dongwu[nI].getType() + " goes " + dongwu[nI].getSound());       
        }    
        System.out.println("The cow is known as " + ((NamedCow)dongwu[0]).getName());
    }
}
