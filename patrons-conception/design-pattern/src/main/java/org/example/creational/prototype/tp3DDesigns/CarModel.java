package org.example.creational.prototype.tp3DDesigns;

public class CarModel extends Model3D{
    public CarModel(){
        this.size = "Medium";
        this.color = "Red";
        this.texture = "Metallic";
    }

    @Override
    public Model3D clone() {
        PlaneModel copy = new PlaneModel();
        copy.setSize(this.size);
        copy.setColor(this.color);
        copy.setTexture(this.texture);
        return copy;
    }
}
