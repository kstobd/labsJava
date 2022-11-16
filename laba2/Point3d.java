class Point3d extends Point2d {

    public Point3d(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Point3d() {
        this(0, 0, 0);
    }

    private double z;

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public boolean equals(Point3d anotherPoint) {
        return super.getX() == anotherPoint.getX() && super.getY() == anotherPoint.getY()
                && this.z == anotherPoint.getZ();
    }

    public double distanceTo(Point3d anotherPoint) {
        double x = Math.pow(super.getX() - anotherPoint.getX(), 2);
        double y = Math.pow(super.getY() - anotherPoint.getY(), 2);
        double z = Math.pow(this.z - anotherPoint.getZ(), 2);

        return Math.sqrt(x + y + z);
    }
}