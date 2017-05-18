// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/usage.proto

package com.google.api;

public interface UsageRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.UsageRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Selects the methods to which this rule applies. Use '*' to indicate all
   * methods in all APIs.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>optional string selector = 1;</code>
   */
  java.lang.String getSelector();
  /**
   * <pre>
   * Selects the methods to which this rule applies. Use '*' to indicate all
   * methods in all APIs.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>optional string selector = 1;</code>
   */
  com.google.protobuf.ByteString
      getSelectorBytes();

  /**
   * <pre>
   * True, if the method allows unregistered calls; false otherwise.
   * </pre>
   *
   * <code>optional bool allow_unregistered_calls = 2;</code>
   */
  boolean getAllowUnregisteredCalls();
}
