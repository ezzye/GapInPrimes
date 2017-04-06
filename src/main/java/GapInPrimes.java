/**
 * Created by ellioe03 on 05/04/2017.
 */
class GapInPrimes {

    public static long[] gap(int g, long m, long n) {
        long first;
        long second;
        first = nextPrimeNumberIncluding(m);
        long[] result = new long[2];

        while(1==1) {
            second = nextPrimeNumberIncluding(first + 1);
            if(second-first==g) {
                result[0]=first;
                result[1]=second;
                return result;
            }
            first++;
            first = nextPrimeNumberIncluding(first);

            if(second > n) {
                return null;
            }
        }

    }

    public static long nextPrimeNumberIncluding(long n) {
        long nextPrime = n;
        while(1==1) {
            boolean isPrime = true;
            for (long i = 2;i < nextPrime;i++) {
                if(nextPrime%i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                return nextPrime;
            }
            nextPrime++;
        }

    }
}
