package Enum.Device;

public enum MemorySize {

    A(1024), B(2048), C(4096), D(6144), E(8192), F(16384), G(32768), H(65536), I(131072), J(262144), 
    K(524288), L(1048576), M(2097152);

    private int SIZE;

    MemorySize(int size) {

        this.SIZE = size;

    }

    public int getSize() {

        return this.SIZE;

    }

}
