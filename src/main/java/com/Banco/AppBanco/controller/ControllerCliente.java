package com.Banco.AppBanco.controller;

import com.Banco.AppBanco.entidades.Cliente;
import com.Banco.AppBanco.repositorio.ClienteRepositorio;
import com.Banco.AppBanco.servicios.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ControllerCliente {

    @Autowired
    private ClienteServicio servicio;
    @GetMapping("cliente")
    public String listarclientes(Model modelo) {
        modelo.addAttribute("clientes",servicio.listarclientes());
        return ("clientes");
    }

    @GetMapping("/cliente/nuevo")

    public String formularioregistrocliente(Model modelo){
        modelo.addAttribute("clienteinsertar", new Cliente());
        return "insertarcliente";
    }

    @Autowired
    private ClienteRepositorio repositorio;

    @PostMapping("/cliente/guardar")

    public String registrardatoscliente(Cliente cliente){
        Cliente clienteguardar=repositorio.save(new Cliente(cliente.getDocumento(), cliente.getNombre(), cliente.getApellido(), cliente.getCorreo(), cliente.getCelular()));
        return "redirect:/cliente";
    }
}
