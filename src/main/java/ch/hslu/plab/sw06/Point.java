/*
 * Copyright 2016 Hochschule Luzern Informatik.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ch.hslu.plab.sw06;

/**
 * Modell eines Punktes im 2D-Raum.
 * Klasse ist Immutable implementiert.
 */
@SuppressWarnings("PMD.ShortVariable")
public class Point extends ch.hslu.demo.Point{

    /**
     * Konstruktor für Punkt mit Koordinaten.
     * @param x x-Koordinate.
     * @param y y-Koordinate.
     */
    public Point(final int x, final int y) {
        super(x,y);
    }

    /**
     * Moves a point relative in the x and y direction.
     * @param x the movement in the x direction
     * @param y the movement in the y direction
     */
    public void moveRelative(final int x, final int y){
        this.x += x;
        this.y += y;
    }

    /**
     * Moves the current instance relative with an offset of the point
     * @param relativeMovement the point which defines the relative offset to do
     */
    public void moveRelative(final Point relativeMovement){
        this.x += relativeMovement.x;
        this.y += relativeMovement.y;
    }

    /**
     * Moves the point to a given vector
     * @param angle the angle of the movement in radians
     * @param length the lengh of the movement
     */
    public void moveByVector(double angle, int length){
        this.x += Math.cos(angle) * length;
        this.y += Math.sin(angle) * length;
    }
}
