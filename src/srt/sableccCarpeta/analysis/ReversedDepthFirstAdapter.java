/* This file was generated by SableCC (http://www.sablecc.org/). */

package srt.sableccCarpeta.analysis;

import java.util.*;
import srt.sableccCarpeta.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPListasubtitulo().apply(this);
        outStart(node);
    }

    public void inASubtituloListasubtitulo(ASubtituloListasubtitulo node)
    {
        defaultIn(node);
    }

    public void outASubtituloListasubtitulo(ASubtituloListasubtitulo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASubtituloListasubtitulo(ASubtituloListasubtitulo node)
    {
        inASubtituloListasubtitulo(node);
        if(node.getSubtitulo() != null)
        {
            node.getSubtitulo().apply(this);
        }
        outASubtituloListasubtitulo(node);
    }

    public void inAListsubtituloListasubtitulo(AListsubtituloListasubtitulo node)
    {
        defaultIn(node);
    }

    public void outAListsubtituloListasubtitulo(AListsubtituloListasubtitulo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListsubtituloListasubtitulo(AListsubtituloListasubtitulo node)
    {
        inAListsubtituloListasubtitulo(node);
        if(node.getListasubtitulo() != null)
        {
            node.getListasubtitulo().apply(this);
        }
        if(node.getSubtitulo() != null)
        {
            node.getSubtitulo().apply(this);
        }
        outAListsubtituloListasubtitulo(node);
    }

    public void inASubtitulo(ASubtitulo node)
    {
        defaultIn(node);
    }

    public void outASubtitulo(ASubtitulo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASubtitulo(ASubtitulo node)
    {
        inASubtitulo(node);
        if(node.getTextlist() != null)
        {
            node.getTextlist().apply(this);
        }
        if(node.getTiempo() != null)
        {
            node.getTiempo().apply(this);
        }
        if(node.getDigito() != null)
        {
            node.getDigito().apply(this);
        }
        outASubtitulo(node);
    }

    public void inATiempo(ATiempo node)
    {
        defaultIn(node);
    }

    public void outATiempo(ATiempo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATiempo(ATiempo node)
    {
        inATiempo(node);
        if(node.getHora2() != null)
        {
            node.getHora2().apply(this);
        }
        if(node.getFlecha() != null)
        {
            node.getFlecha().apply(this);
        }
        if(node.getHora1() != null)
        {
            node.getHora1().apply(this);
        }
        outATiempo(node);
    }

    public void inAHora1(AHora1 node)
    {
        defaultIn(node);
    }

    public void outAHora1(AHora1 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAHora1(AHora1 node)
    {
        inAHora1(node);
        if(node.getMiliseg() != null)
        {
            node.getMiliseg().apply(this);
        }
        if(node.getComa() != null)
        {
            node.getComa().apply(this);
        }
        if(node.getSegundos() != null)
        {
            node.getSegundos().apply(this);
        }
        if(node.getD2() != null)
        {
            node.getD2().apply(this);
        }
        if(node.getMinutos() != null)
        {
            node.getMinutos().apply(this);
        }
        if(node.getD1() != null)
        {
            node.getD1().apply(this);
        }
        if(node.getHora() != null)
        {
            node.getHora().apply(this);
        }
        outAHora1(node);
    }

    public void inAHora2(AHora2 node)
    {
        defaultIn(node);
    }

    public void outAHora2(AHora2 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAHora2(AHora2 node)
    {
        inAHora2(node);
        if(node.getMiliseg() != null)
        {
            node.getMiliseg().apply(this);
        }
        if(node.getComa() != null)
        {
            node.getComa().apply(this);
        }
        if(node.getSegundos() != null)
        {
            node.getSegundos().apply(this);
        }
        if(node.getP2() != null)
        {
            node.getP2().apply(this);
        }
        if(node.getMinutos() != null)
        {
            node.getMinutos().apply(this);
        }
        if(node.getP1() != null)
        {
            node.getP1().apply(this);
        }
        if(node.getHora() != null)
        {
            node.getHora().apply(this);
        }
        outAHora2(node);
    }

    public void inAHora(AHora node)
    {
        defaultIn(node);
    }

    public void outAHora(AHora node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAHora(AHora node)
    {
        inAHora(node);
        if(node.getDigito() != null)
        {
            node.getDigito().apply(this);
        }
        outAHora(node);
    }

    public void inAMinutos(AMinutos node)
    {
        defaultIn(node);
    }

    public void outAMinutos(AMinutos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinutos(AMinutos node)
    {
        inAMinutos(node);
        if(node.getDigito() != null)
        {
            node.getDigito().apply(this);
        }
        outAMinutos(node);
    }

    public void inASegundos(ASegundos node)
    {
        defaultIn(node);
    }

    public void outASegundos(ASegundos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASegundos(ASegundos node)
    {
        inASegundos(node);
        if(node.getDigito() != null)
        {
            node.getDigito().apply(this);
        }
        outASegundos(node);
    }

    public void inAMiliseg(AMiliseg node)
    {
        defaultIn(node);
    }

    public void outAMiliseg(AMiliseg node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMiliseg(AMiliseg node)
    {
        inAMiliseg(node);
        if(node.getDigito() != null)
        {
            node.getDigito().apply(this);
        }
        outAMiliseg(node);
    }

    public void inASubTextlist(ASubTextlist node)
    {
        defaultIn(node);
    }

    public void outASubTextlist(ASubTextlist node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASubTextlist(ASubTextlist node)
    {
        inASubTextlist(node);
        if(node.getSub() != null)
        {
            node.getSub().apply(this);
        }
        outASubTextlist(node);
    }

    public void inATextlistTextlist(ATextlistTextlist node)
    {
        defaultIn(node);
    }

    public void outATextlistTextlist(ATextlistTextlist node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATextlistTextlist(ATextlistTextlist node)
    {
        inATextlistTextlist(node);
        if(node.getTextlist() != null)
        {
            node.getTextlist().apply(this);
        }
        if(node.getSub() != null)
        {
            node.getSub().apply(this);
        }
        outATextlistTextlist(node);
    }

    public void inASub1Sub(ASub1Sub node)
    {
        defaultIn(node);
    }

    public void outASub1Sub(ASub1Sub node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASub1Sub(ASub1Sub node)
    {
        inASub1Sub(node);
        if(node.getE2() != null)
        {
            node.getE2().apply(this);
        }
        if(node.getTexto() != null)
        {
            node.getTexto().apply(this);
        }
        if(node.getE1() != null)
        {
            node.getE1().apply(this);
        }
        outASub1Sub(node);
    }

    public void inASub2Sub(ASub2Sub node)
    {
        defaultIn(node);
    }

    public void outASub2Sub(ASub2Sub node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASub2Sub(ASub2Sub node)
    {
        inASub2Sub(node);
        if(node.getTexto() != null)
        {
            node.getTexto().apply(this);
        }
        outASub2Sub(node);
    }
}
