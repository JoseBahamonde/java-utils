package com.bahamonde.utils.builders;

/**
 * Utility to ease the creation of Boolean expressions using the Builder pattern
 * @author jbahamonde
 * 
 */
public class BooleanBuilder {

	private boolean value;
	
	private BooleanBuilder(boolean initialValue) {
		this.value = initialValue;
	}
	
	/**
	 * Applies a logical and to the builder
	 * @param other: The value to perform the operation
	 * @return
	 */
	public BooleanBuilder and(boolean other) {
		this.value = this.value && other;
		return this;
	}
	
	/**
	 * Applies a logical or to the builder
	 * @param other: The value to perform the operation
	 * @return
	 */
	public BooleanBuilder or(boolean other) {
		this.value = this.value || other;
		return this;
	}
	
	/**
	 * Applies a logical xor to the builder
	 * @param other: The value to perform the operation
	 * @return
	 */
	public BooleanBuilder xor(boolean other) {
		this.value = this.value ^ other;
		return this;
	}
	
	/**
	 * Applies a logical nor to the builder
	 * @param other: The value to perform the operation
	 * @return
	 */
	public BooleanBuilder nor(boolean other) {
		this.value = !(this.value || other);
		return this;
	}
	
	/**
	 * Applies a logical nand to the builder
	 * @param other: The value to perform the operation
	 * @return
	 */
	public BooleanBuilder nand(boolean other) {
		this.value = !(this.value && other);
		return this;
	}
	
	/**
	 * Applies a logical xnor to the builder
	 * @param other: The value to perform the operation
	 * @return
	 */
	public BooleanBuilder xnor(boolean other) {
		this.value = (this.value && other) || (!this.value && !other);
		return this;
	}
	
	/**
	 * Applies a logical not to the builder
	 * @param other: The value to perform the operation
	 * @return
	 */
	public BooleanBuilder not() {
		this.value = !this.value;
		return this;
	}
	
	/**
	 * @return The value accumulated on the builder.
	 */
	public boolean result() {
		return this.value;
	}
	
	/**
	 * Constructs the builder starting with a true value
	 */
	public static BooleanBuilder trueValue() {
		return new BooleanBuilder(true);
	}
	
	/**
	 * Constructs the builder starting with a false value
	 */
	public static BooleanBuilder falseValue() {
		return new BooleanBuilder(false);
	}
	
	/**
	 * Constructs the builder with the given initial value
	 */
	public static BooleanBuilder of(boolean initialValue) {
		return new BooleanBuilder(initialValue);
	}

}