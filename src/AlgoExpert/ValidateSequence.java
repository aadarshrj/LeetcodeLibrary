package AlgoExpert;

/*
* array = {1,23,-2,98,34,-122,0,32,7,-11,5,67}
* the subsequence of this array can be
*  arraysubsequence = {23,98,-11,67}
* */
public class ValidateSequence {
    public static void main(String[] args) {
            int array[] = {1,24,45,7,8,-12,-67,9};
            int seq[] = {45,-12,9};
        System.out.println(isValidSequence(array,seq));
        System.out.println(isValidSeq2(array,seq));
    }
    //using while loop
    public static boolean isValidSequence(int array[] , int sequence[]){
        int seqIndex = 0;
        int arrIndex = 0;

        while (arrIndex < array.length && seqIndex < sequence.length){
                    if(sequence[seqIndex] == array[arrIndex]){
                        seqIndex++;
                    }
                    arrIndex += 1;
        }
        return (seqIndex == sequence.length);
    }
    //using for loop
        public static boolean isValidSeq2(int[] array ,int[] seq){
            int seqIndex = 0;
            for (int i = 0; i < array.length; i++) {
                if(seqIndex == seq.length){
                    return true;
                }else if(seq[seqIndex] == array[i]){
                    seqIndex++;
                }
            }
        return (seqIndex == seq.length);
    }
}
