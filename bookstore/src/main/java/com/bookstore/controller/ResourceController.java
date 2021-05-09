package com.bookstore.controller;

import com.bookstore.config.BookService;
import com.bookstore.model.DAOBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ResourceController {

    @Autowired
    BookService bookService;

    @RequestMapping("/hellouser")
    public String getUser()
    {
        return "Hello User";
    }

    @RequestMapping("/helloadmin")
    public String getAdmin()
    {
        return "Hello Admin";
    }

    @GetMapping(path = "/books_borrowed")
    public ArrayList<DAOBook> findByIs_borrowed(@RequestParam("is_borrowed") boolean borrowed){
        return this.bookService.findByIs_borrowed(borrowed);
    }

    @GetMapping(path = "/category")
    public DAOBook findByCategory(@RequestParam("category")String category){
        return this.bookService.findByCategory(category);
    }

    @GetMapping(path = "/title")
    public DAOBook findByTitle(@RequestParam("title")String title){
        return this.bookService.findByTitle(title);
    }
//    public DAOBook findByTitle(String title);
//    public DAOBook findByCategory(String category);
//    public ArrayList<DAOBook> findByIs_borrowed(boolean borrowed);


//    @GetMapping()
//    public ArrayList<BookService> obtenerUsuarios(){
//        return this.usuarioService.obtenerUsuarios();
//    }

//    @PostMapping()
//    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
//        return this.usuarioService.guardarUsuario(usuario);
//    }
//
//    @GetMapping(path = "/{id}")
//    public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Long id){
//        return this.usuarioService.obtenerPorId(id);
//    }
//
//    @GetMapping("/query")
//    public ArrayList<UsuarioModel> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad){
//        return this.usuarioService.obtenerPorPrioridad(prioridad);
//    }

}