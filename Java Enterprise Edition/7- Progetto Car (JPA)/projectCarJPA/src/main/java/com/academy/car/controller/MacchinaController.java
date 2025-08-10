package com.academy.car.controller;

import org.springframework.web.bind.annotation.*;

import com.academy.car.controller.response.ResponseBase;
import com.academy.car.controller.response.ResponseList;
import com.academy.car.dto.MacchinaDTO;
import com.academy.car.requests.MacchinaReq;
import com.academy.car.services.interfaces.IMacchinaServices;

@RestController
@RequestMapping("/rest/macchina")
public class MacchinaController 
{
    private IMacchinaServices macchinaS;

    public MacchinaController(IMacchinaServices macchinaS) 
    {
        this.macchinaS = macchinaS;
    }

    @GetMapping("/list")
    public ResponseList<MacchinaDTO> list() 
    {
        ResponseList<MacchinaDTO> r = new ResponseList<MacchinaDTO>();

        try 
        {
            r.setDati(macchinaS.listAll());

            // Return the success code
            r.setRc(true);
        } 
        catch (Exception e) 
        {
            r.setRc(false);
            r.setMsg(e.getMessage());
        }

        return r;
    }

    @PostMapping("/create")
    public ResponseBase create(@RequestBody(required = true) MacchinaReq req) 
    {
        ResponseBase r = new ResponseBase();

        try 
        {
            macchinaS.insert(req);
            r.setRc(true);
        } 
        catch (Exception e) 
        {
            r.setRc(false);
            r.setMsg(e.getMessage());
        }

        return r;
    }

    @PutMapping("/update")
    public ResponseBase update(@RequestBody(required = true) MacchinaReq req) 
    {
        ResponseBase r = new ResponseBase();

        try 
        {
            macchinaS.update(req);
            r.setRc(true);
        } 
        catch (Exception e) 
        {
            r.setRc(false);
            r.setMsg(e.getMessage());
        }

        return r;
    }

    @DeleteMapping("/delete")
    public ResponseBase delete(@RequestBody(required = true) MacchinaReq req) 
    {
        ResponseBase r = new ResponseBase();

        try 
        {
            macchinaS.delete(req);
            r.setRc(true);
        } 
        catch (Exception e) 
        {
            r.setRc(false);
            r.setMsg(e.getMessage());
        }

        return r;
    }
}