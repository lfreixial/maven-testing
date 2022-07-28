package main

import (
	"testing"
)

func TestSum(t *testing.T) {
	want := 8
	got := Sum(3, 5)

	if got != want {
		t.Errorf("Test fail! want: %d, got: %d", want, got)
	}

}

func TestMul(t *testing.T) {
	want := 25
	got := Mul(5, 5)

	if got != want {
		t.Errorf("Test fail! want: %d, got: %d", want, got)
	}

}
