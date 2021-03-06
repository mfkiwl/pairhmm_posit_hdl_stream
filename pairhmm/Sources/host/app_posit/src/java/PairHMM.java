public class PairHMM {

    public static void main(String[] args) {
        
        Pair[] pairs = new Pair[29165];
                       
        String read = "ACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGACTGAC";
        String hapl = "AACCTTGGAAAACCCCTTTTGGGGAAAAAAAACCCCCCCCTTTTTTTTGGGGGGGGAACCTTGGAAAACCCCTTTTGGGGAAAAAAAACCCCCCCCTTTTTTTTGGGGGGGGAACCTTGGAAAACCCCTTTTGGGGAAAAAAAACCCCCCCCTTTTTTTTGGGGGGGGAACCTTGGAAAACCCCTTTTGGGGAAAAAAAACCCCCCCCTTTTTTTTGGGGGGGGAACCTTGGAAAACCCCTTTTGGGGAAAAAAAACCCCCCCCTTTTTTTTGGGGGGGGAACCTTGGAAAACCCCTTTTGGGGAAAAAAAACCCCCCCCTTTTTTTTGGGGGGGGAACCTTGGAAAACCCCTTTTGGGGAAAAAAAACCCCCCCCTTTTTTTTGGGGGGGGAACCTTGGAAAACCCCTTTTGGGGAAAAAAAACCCCCCCCTTTTTTTTGGGGGGGGAACCTTGGAAAACCCCTTTTGGGGAAAAAAAACCCCCCCCTTTTTTTTGGGGGGGGAACCTTGGAAAACCCCTTTTGGGGAAAAAAAACCCCCCCCTTTTTTTTGGGGGGGG";
                
        //System.out.println("Size      : " + p.size);
        //System.out.println("Haplotype : " + p.getHapl());
        //System.out.println("Read      : " + p.getRead());
        
        long time = System.nanoTime();
                
        for (int i = 0; i < 29165; i++)
        {
        	pairs[i] = new Pair();
	        pairs[i].setSize(200);
	        pairs[i].read = read.substring(0,200).toCharArray();
	        pairs[i].hapl = hapl.substring(0,200).toCharArray();
	        pairs[i].fillProbs();
        }
        
        time = System.nanoTime() - time;
        
        System.out.println((double)time / 1000000000.0);
        
        float temp = 0;
        
        for (int i = 0; i < 29165; i++)
        {
        	temp = temp + pairs[i].size + pairs[i].probs[i%10][i%8];
        }
        
        System.out.println(temp);
    }

}

