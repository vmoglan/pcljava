package com.github.vmoglan.pcljava;

/**
 * SampleConsensusModelCone defines a model for 3D cone segmentation.
 * The model coefficients are defined as:
 * 
 * <ul>
 *  <li> apex.x : the X coordinate of cone's apex </li>
 *  <li> apex.y : the Y coordinate of cone's apex </li>
 *  <li> apex.z : the Z coordinate of cone's apex </li>
 *  <li> axis_direction.x : the X coordinate of the cone's axis direction </li>
 *  <li> axis_direction.y : the Y coordinate of the cone's axis direction </li>
 *  <li> axis_direction.z : the Z coordinate of the cone's axis direction </li>
 *  <li> opening_angle : the cone's opening angle </li>
 * </ul>
 */
public class SampleConsensusModelCone extends SampleConsensusModel implements SampleConsensusModelFromNormals {
	public SampleConsensusModelCone(PointCloud3d cloud) {
		super(cloud);
	}

	@Override
	protected native void alloc();

	@Override
	public native void dispose();

	@Override
	public native double getNormalDistanceWeight();

	@Override
	public native void setNormalDistanceWeight(double weight);

	@Override
	public NormalCloud getInputNormals() {
		NormalCloud normals = new NormalCloud();
		getInputNormals(normals);
		return normals;
	}
	
	private native void getInputNormals(NormalCloud normals);

	@Override
	public native void setInputNormals(NormalCloud cloud);
}
