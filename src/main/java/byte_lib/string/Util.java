package byte_lib.string;

class Util {
    public static int nBits(long capacity) {
        int bits = 0;
        while (capacity > 0) {
            bits++;
            capacity >>= 1;
        }
        return bits;
    }
}
