/*
 * package com.tma.musicmanager.controller;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.MediaType; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod; import
 * org.springframework.web.bind.annotation.ResponseBody; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.tma.musicmanager.dao.impl.SongDAOImpl; import
 * com.tma.musicmanager.model.Song; import
 * com.tma.musicmanager.service.SongService;
 * 
 * @RestController public class SongRESTController {
 * 
 * @Autowired private SongService songService;
 * 
 * @RequestMapping(value = "/", method = RequestMethod.GET, produces = {
 * MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
 * 
 * @ResponseBody public List<Song> getSong() { List<Song> list =
 * SongDAOImpl.getAllEmployees(); return list; }
 * 
 * @RequestMapping("/")
 * 
 * @ResponseBody public String welcome() { return
 * "Welcome to RestTemplate Example."; }
 * 
 * @GetMapping(value = "/") public List<Song> getSongs() { List<Song> list =
 * SongDAOImpl.getAllEmployees(); return list; }
 * 
 * @GetMapping(value = "/{songId}", produces = {
 * MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }) public
 * Song getSong(@PathVariable("songId") Integer songId) { return
 * SongDAOImpl.getSong(songId); }
 * 
 * @PostMapping(value="/", produces = {MediaType.APPLICATION_JSON_VALUE,
 * MediaType.APPLICATION_ATOM_XML_VALUE}) public Song addSong(@RequestBody Song
 * song) { return SongDAOImpl.addSong(song); }
 * 
 * public Response add(@RequestBody Song song) { //songService.add(song); return
 * song; }
 * 
 * }
 */