package com.trips.Service;


import java.util.List;

import com.trips.models.Trip;


public interface ITripServices {
	

	public List<Trip> buscarTodo();

	public Trip buscarporId(Integer idTrip);
}