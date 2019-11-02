package com.rajkumarrajan.rxjavawithretrofit.network;

import com.rajkumarrajan.rxjavawithretrofit.model.Note;
import com.rajkumarrajan.rxjavawithretrofit.model.User;

import io.reactivex.Completable;
import io.reactivex.Single;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import java.util.List;

/*The Single Observable is used for the the endpoints register, notes/new and notes/all as single response will be emitted.
  Completable Observable is used for both update and delete endpoints as they won’t give any response but the status of the call. You can also notice PUT method is used to update and DELETE method is used to delete a note.*/

public interface ApiService {
    // Register new user
    @FormUrlEncoded
    @POST("notes/user/register")
    Single<User> register(@Field("device_id") String deviceId);

    // Create note
    @FormUrlEncoded
    @POST("notes/new")
    Single<Note> createNote(@Field("note") String note);

    // Fetch all notes
    @GET("notes/all")
    Single<List<Note>> fetchAllNotes();

    // Update single note
    @FormUrlEncoded
    @PUT("notes/{id}")
    Completable updateNote(@Path("id") int noteId, @Field("note") String note);

    // Delete note
    @DELETE("notes/{id}")
    Completable deleteNote(@Path("id") int noteId);
}
