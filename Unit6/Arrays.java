
/**
 * Write a description of class Arrays here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrays
{
    public static void main(String[] argv){
        int[] a1 = randomArray(20223, -1115, 10);
        printArray(a1, true);
        bubbleSort(a1);
        //printArray(a1, true);
        //System.out.println(binarySearch(a1, 3));
        for(int i : a1) System.out.print(i + " ");
        
    }

    public static void print2d(int[][] array, boolean rowMajor){
        if(rowMajor){
            for(int row = 0; row < array.length; row++){
                for(int col = 0; col < array[row].length; col++){
                    System.out.print(array[row][col]+" ");
                }
                System.out.println();
            }
        }else{
            for(int col = 0; col < array[0].length; col++){
                for(int row = 0; row < array.length; row++){
                    System.out.print(array[row][col]+" ");
                }
                System.out.println();
            }
        }
    }

    public static int max(int[] array){
        int m = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > m){
                m = array[i];
            }
        }
        return m;
    }

    public static int minIdx(int[] array){
        int idx = 0;
        for(int i = 1; i < array.length; i++){
            if(array[i] < array[idx]){
                idx = i;
            }
        }
        return idx;
    }

    public static int sum(int[] array){
        int sum = 0;
        for(int i : array){
            sum += i;
        }
        return sum;
    }

    public static double avg(int[] array){
        int s = sum(array);
        return s / (double)array.length;
    }

    public static boolean allGreater(int[] array, int threshold){
        boolean result = true;
        for(int i: array){
            if (i <= threshold){
                result = false;
            }
        }
        return result;
    }

    public static boolean oneGreater(int[] array, int threshold){
        int ct = 0;
        for(int i : array){
            if(i > threshold){
                ct++;
            }
        }    
        return ct == 1;
    }

    public static int sumOfLessThan(int[] array, int threshold){
        int s = 0;
        for(int i : array){
            if (i < threshold){
                s += i;
            }
        }

        return s;
    }

    public static int greatestPairIdx(int[] array){
        int idx = 0;
        int sum = array[0] + array[1];
        for(int i = 1; i < array.length - 1; i++){
            int pair = array[i] + array[i+1];
            if(pair > sum){
                idx = i;
                sum = pair;
            }
        }
        return idx;
    }

    public static int[] reveresed(int[] array){
        int[] result = new int[array.length];
        for(int i = array.length - 1; i >= 0 ; i--){
            result[array.length -1 -i] = array[i];
        }
        return result;
    }

    public static int[] shiftLeft(int[] array, int distance){
        int[] result = new int[array.length];
        int rdx = 0;
        for(int i = distance; i < array.length; i++){
            result[rdx] = array[i];
            rdx++;
        }
        rdx = array.length - distance;
        for(int i = 0; i < distance; i++){
            result[rdx] = array[i];
            rdx++;
        }
        return result;
    }

    public static int[] shiftRight(int[] array, int distance){
        int[] result = new int[array.length];
        int rdx = array.length - distance;
        for(int i = 0; i < distance; i++){
            result[rdx] = array[i];
            rdx++;
        }
        rdx = 0;
        for(int i = distance; i < array.length; i++){
            result[rdx] = array[i];
            rdx++;
        }
        return result;
    }

    public static int[] interleave(int[] array1, int array2[]){
        int[] result = new int[array1.length + array2.length];
        int i1 = 0;
        int i2 = 0;
        int ir = 0;
        while(ir < result.length){
            if(i1 < array1.length){
                result[ir] = array1[i1];
                i1++;
                ir++;
            }
            if(i2 < array2.length){
                result[ir] = array2[i2];
                i2++;
                ir++;
            }
        }
        return result;
    }

    public static int[] unique(int[] arr){
        int[] found = new int[arr.length];
        found[0] = arr[0];
        int uniqueCt = 1;
        int[] unique;
        for(int i = 1; i < arr.length; i++){
            int v = arr[i];
            boolean match = false;
            for(int j = 0; j <= uniqueCt; j++){
                if(v == found[j]){
                    match = true;
                }
            }
            if(!match){
                found[uniqueCt] = v;
                uniqueCt++;
            }
        }
        unique = new int[uniqueCt];
        for(int i = 0; i < uniqueCt; i++){
            unique[i] = found[i];
        }
        return unique;
    }

    public static void bubbleSort(int[] array){
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] > array[i+1]){
                    int tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                    sorted = false;
                }
            }   
        }   
    }

    public static int binarySearch(int[] array, int v){
        int idx = -1;
        int low = 0;
        int high = array.length - 1;
        int searchIdx = (low + high) / 2;
        boolean searching = true;
        while(low < high){
            System.out.println(searchIdx + ": "+array[searchIdx]);
            if(array[searchIdx] == v){
                idx = searchIdx;
                low = high;
            }else if(array[searchIdx] < v){
                high = searchIdx;
                searchIdx = (low + high) / 2;
            }else if(array[searchIdx] > v){
                low = searchIdx;
                searchIdx = (low + high) / 2;
            }               
        }
        return idx;
    }

    public static int[] randomArray(int length, int min, int max){
        int[] array = new int[length];
        for(int i = 0; i < length; i++){
            array[i] = (int)(Math.random() * (max - min)) + min;
        }
        return array;
    }

    public static void printArray(int[] arr, boolean forward){
        String out = "";
        if(forward){
            for(int i = 0; i < arr.length; i++){
                out += arr[i] +", ";
            }
        }else{
            for(int i = arr.length-1; i >= 0; i--){
                out += arr[i] +", ";
            }
        }
        System.out.println(out);
    }
}
